// 
// Decompiled by Procyon v0.6.0
// 

package X;

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
import com.bytedance.covode.number.Covode;
import android.view.Window$Callback;

public class 02b implements Window$Callback
{
    public final Window$Callback LIZIZ;
    
    static {
        Covode.recordClassIndex(330);
    }
    
    public 02b(final Window$Callback liziz) {
        if (liziz != null) {
            this.LIZIZ = liziz;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.LIZIZ.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.LIZIZ.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.LIZIZ.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.LIZIZ.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.LIZIZ.dispatchTouchEvent(motionEvent);
    }
    
    public boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.LIZIZ.dispatchTrackballEvent(motionEvent);
    }
    
    public void onActionModeFinished(final ActionMode actionMode) {
        this.LIZIZ.onActionModeFinished(actionMode);
    }
    
    public void onActionModeStarted(final ActionMode actionMode) {
        this.LIZIZ.onActionModeStarted(actionMode);
    }
    
    public void onAttachedToWindow() {
        this.LIZIZ.onAttachedToWindow();
    }
    
    public void onContentChanged() {
        this.LIZIZ.onContentChanged();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.LIZIZ.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.LIZIZ.onCreatePanelView(n);
    }
    
    public void onDetachedFromWindow() {
        this.LIZIZ.onDetachedFromWindow();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.LIZIZ.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.LIZIZ.onMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.LIZIZ.onPanelClosed(n, menu);
    }
    
    public void onPointerCaptureChanged(final boolean b) {
        this.LIZIZ.onPointerCaptureChanged(b);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.LIZIZ.onPreparePanel(n, view, menu);
    }
    
    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
        this.LIZIZ.onProvideKeyboardShortcuts((List)list, menu, n);
    }
    
    public boolean onSearchRequested() {
        return this.LIZIZ.onSearchRequested();
    }
    
    public boolean onSearchRequested(final SearchEvent searchEvent) {
        return this.LIZIZ.onSearchRequested(searchEvent);
    }
    
    public void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.LIZIZ.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        this.LIZIZ.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.LIZIZ.onWindowStartingActionMode(actionMode$Callback);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
        return this.LIZIZ.onWindowStartingActionMode(actionMode$Callback, n);
    }
}
