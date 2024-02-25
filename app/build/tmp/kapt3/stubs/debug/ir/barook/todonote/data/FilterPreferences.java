package ir.barook.todonote.data;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.*;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lir/barook/todonote/data/FilterPreferences;", "", "sortOrder", "Lir/barook/todonote/data/SortOrder;", "hideCompleted", "", "(Lir/barook/todonote/data/SortOrder;Z)V", "getHideCompleted", "()Z", "getSortOrder", "()Lir/barook/todonote/data/SortOrder;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class FilterPreferences {
    @org.jetbrains.annotations.NotNull
    private final ir.barook.todonote.data.SortOrder sortOrder = null;
    private final boolean hideCompleted = false;
    
    @org.jetbrains.annotations.NotNull
    public final ir.barook.todonote.data.FilterPreferences copy(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.SortOrder sortOrder, boolean hideCompleted) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public FilterPreferences(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.SortOrder sortOrder, boolean hideCompleted) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ir.barook.todonote.data.SortOrder component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ir.barook.todonote.data.SortOrder getSortOrder() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getHideCompleted() {
        return false;
    }
}