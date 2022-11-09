// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.DragEvent;
import android.app.Activity;
import android.view.DragAndDropPermissions;

public final class f
{
    public static final class a
    {
        public static void a(final DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }
        
        public static DragAndDropPermissions b(final Activity activity, final DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }
}
