package ir.barook.todonote;

import dagger.hilt.internal.aggregatedroot.codegen._ir_barook_todonote_ToDoApplication;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;
import hilt_aggregated_deps._ir_barook_todonote_MainActivity_GeneratedInjector;
import hilt_aggregated_deps._ir_barook_todonote_ToDoApplication_GeneratedInjector;
import hilt_aggregated_deps._ir_barook_todonote_di_AppModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_NotesFragment_GeneratedInjector;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_NotesViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_NotesViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_delete_DeleteAllNotesViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_delete_DeleteAllNotesViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_delete_DeleteAllNotes_GeneratedInjector;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_edit_AddEditNoteFragment_GeneratedInjector;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_edit_AddEditNoteViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_notes_edit_AddEditNoteViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_TasksFragment_GeneratedInjector;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_TasksViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_TasksViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_delete_DeleteAllCompletedTasksDialogFragment_GeneratedInjector;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_delete_DeleteAllCompletedViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_delete_DeleteAllCompletedViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_edit_AddEditTaskFragment_GeneratedInjector;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_edit_AddEditTaskViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._ir_barook_todonote_ui_todo_tasks_edit_AddEditTaskViewModel_HiltModules_KeyModule;

@ComponentTreeDeps(
    rootDeps = _ir_barook_todonote_ToDoApplication.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint.class,
        _dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class,
        _ir_barook_todonote_MainActivity_GeneratedInjector.class,
        _ir_barook_todonote_ToDoApplication_GeneratedInjector.class,
        _ir_barook_todonote_di_AppModule.class,
        _ir_barook_todonote_ui_notes_NotesFragment_GeneratedInjector.class,
        _ir_barook_todonote_ui_notes_NotesViewModel_HiltModules_BindsModule.class,
        _ir_barook_todonote_ui_notes_NotesViewModel_HiltModules_KeyModule.class,
        _ir_barook_todonote_ui_notes_delete_DeleteAllNotesViewModel_HiltModules_BindsModule.class,
        _ir_barook_todonote_ui_notes_delete_DeleteAllNotesViewModel_HiltModules_KeyModule.class,
        _ir_barook_todonote_ui_notes_delete_DeleteAllNotes_GeneratedInjector.class,
        _ir_barook_todonote_ui_notes_edit_AddEditNoteFragment_GeneratedInjector.class,
        _ir_barook_todonote_ui_notes_edit_AddEditNoteViewModel_HiltModules_BindsModule.class,
        _ir_barook_todonote_ui_notes_edit_AddEditNoteViewModel_HiltModules_KeyModule.class,
        _ir_barook_todonote_ui_todo_tasks_TasksFragment_GeneratedInjector.class,
        _ir_barook_todonote_ui_todo_tasks_TasksViewModel_HiltModules_BindsModule.class,
        _ir_barook_todonote_ui_todo_tasks_TasksViewModel_HiltModules_KeyModule.class,
        _ir_barook_todonote_ui_todo_tasks_delete_DeleteAllCompletedTasksDialogFragment_GeneratedInjector.class,
        _ir_barook_todonote_ui_todo_tasks_delete_DeleteAllCompletedViewModel_HiltModules_BindsModule.class,
        _ir_barook_todonote_ui_todo_tasks_delete_DeleteAllCompletedViewModel_HiltModules_KeyModule.class,
        _ir_barook_todonote_ui_todo_tasks_edit_AddEditTaskFragment_GeneratedInjector.class,
        _ir_barook_todonote_ui_todo_tasks_edit_AddEditTaskViewModel_HiltModules_BindsModule.class,
        _ir_barook_todonote_ui_todo_tasks_edit_AddEditTaskViewModel_HiltModules_KeyModule.class
    }
)
public final class ToDoApplication_ComponentTreeDeps {
}
