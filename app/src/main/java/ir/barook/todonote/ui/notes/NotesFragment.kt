package ir.barook.todonote.ui.notes

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import ir.barook.todonote.R
import ir.barook.todonote.data.Notes
import ir.barook.todonote.databinding.FragmentNotesBinding
import ir.barook.todonote.util.exhaustive
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotesFragment : Fragment(R.layout.fragment_notes), NotesAdapter.OnItemClickListener {

    private val viewModel : NotesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notes, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentNotesBinding.bind(view)
        val notesAdapter = NotesAdapter(this)

        binding.apply {
            notesRecyc.apply {
                adapter = notesAdapter
                layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
                setHasFixedSize(true)
            }

            //ADD NEW NOTE
            floatAddButton.setOnClickListener {
                viewModel.onAddNewNoteClick()
            }

            setFragmentResultListener("note_add_edit_request"){_, bundle ->
                val result = bundle.getInt("note_add_edit_request")
                viewModel.onAddEditNoteResult(result)

            }

        }


        viewModel.notes.observe(viewLifecycleOwner){
            notesAdapter.differ.submitList(it)
        }



        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.noteEvent.collect { event ->
                when(event){
                    is NotesViewModel.NotesEvent.NavigateToAddScreen ->
                    {
                        val action = NotesFragmentDirections.actionNotesFragmentToAddEditNoteFragment("New Note",null )
                        findNavController().navigate(action)
                    }
                    is NotesViewModel.NotesEvent.NavigateToEditNoteScreen -> {
                        val action = NotesFragmentDirections.actionNotesFragmentToAddEditNoteFragment("Edit Note", event.note)
                        findNavController().navigate(action)
                    }
                    is NotesViewModel.NotesEvent.ShowUndoDeleteNoteMessage -> {
                        Snackbar.make(requireView(),"Note Deleted", Snackbar.LENGTH_LONG)
                            .setAction("UNDO"){
                                viewModel.onUndoDeleteClick(event.note)
                            }.show()
                    }
                    is NotesViewModel.NotesEvent.ShowNoteSavedConfirmationMessage -> {
                        Snackbar.make(requireView(), event.msg, Snackbar.LENGTH_SHORT).show()
                    }
                    is NotesViewModel.NotesEvent.NavigateToDeleteAllScreen -> {
                        val action = NotesFragmentDirections.actionGlobalDeleteAllNotes()
                        findNavController().navigate(action)
                    }
                }

            }
        }.exhaustive

        setHasOptionsMenu(true)

    }

    override fun onItemClick(note: Notes) {
        viewModel.onNoteSelected(note)
    }

    override fun onDeleteNoteClick(note: Notes) {
        viewModel.deleteNote(note)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_fragment_notes, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_delete_all_notes ->{
                viewModel.deleteAllNotes()

                true
            }

            else -> super.onOptionsItemSelected(item)





        }
    }

}