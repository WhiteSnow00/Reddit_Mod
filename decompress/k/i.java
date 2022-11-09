// 
// Decompiled by Procyon v0.6.0
// 

package k;

import a4.q;
import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.SearchEvent;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window$Callback;

public class i implements Window$Callback
{
    public final Window$Callback f;
    
    public i(final Window$Callback f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.f.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.f.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.f.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.f.dispatchTouchEvent(motionEvent);
    }
    
    public final boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.f.dispatchTrackballEvent(motionEvent);
    }
    
    public final void onActionModeFinished(final ActionMode actionMode) {
        this.f.onActionModeFinished(actionMode);
    }
    
    public final void onActionModeStarted(final ActionMode actionMode) {
        this.f.onActionModeStarted(actionMode);
    }
    
    public final void onAttachedToWindow() {
        this.f.onAttachedToWindow();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.f.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.f.onCreatePanelView(n);
    }
    
    public final void onDetachedFromWindow() {
        this.f.onDetachedFromWindow();
    }
    
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.f.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.f.onMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.f.onPanelClosed(n, menu);
    }
    
    public final void onPointerCaptureChanged(final boolean b) {
        c.a(this.f, b);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.f.onPreparePanel(n, view, menu);
    }
    
    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
        b.a(this.f, list, menu, n);
    }
    
    public final boolean onSearchRequested() {
        return this.f.onSearchRequested();
    }
    
    public final boolean onSearchRequested(final SearchEvent searchEvent) {
        return a.a(this.f, searchEvent);
    }
    
    public final void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.f.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        this.f.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
        return a.b(this.f, actionMode$Callback, n);
    }
    
    public static final class a
    {
        public static boolean a(final Window$Callback window$Callback, final SearchEvent searchEvent) {
            return window$Callback.onSearchRequested(searchEvent);
        }
        
        public static ActionMode b(final Window$Callback window$Callback, final ActionMode$Callback actionMode$Callback, final int n) {
            return window$Callback.onWindowStartingActionMode(actionMode$Callback, n);
        }
    }
    
    public static final class b
    {
        public static void a(final Window$Callback window$Callback, final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
            window$Callback.onProvideKeyboardShortcuts((List)list, menu, n);
        }
    }
    
    public static final class c
    {
        public static void a(final Window$Callback window$Callback, final boolean b) {
            q.k(window$Callback, b);
        }
    }
}
