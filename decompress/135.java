// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.Menu;

public class 135 extends 02d implements Menu
{
    public final 05n LIZIZ;
    
    static {
        Covode.recordClassIndex(367);
    }
    
    public 135(final Context context, final 05n liziz) {
        super(context);
        if (liziz != null) {
            this.LIZIZ = liziz;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public MenuItem add(final int n) {
        return this.LIZ(this.LIZIZ.add(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.LIZ(this.LIZIZ.add(n, n2, n3, n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.LIZ(this.LIZIZ.add(n, n2, n3, charSequence));
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.LIZ(this.LIZIZ.add(charSequence));
    }
    
    public int addIntentOptions(int i, int length, int addIntentOptions, final ComponentName componentName, final Intent[] array, final Intent intent, final int n, final MenuItem[] array2) {
        MenuItem[] array3;
        if (array2 != null) {
            array3 = new MenuItem[array2.length];
        }
        else {
            array3 = null;
        }
        addIntentOptions = this.LIZIZ.addIntentOptions(i, length, addIntentOptions, componentName, array, intent, n, array3);
        if (array3 != null) {
            for (i = 0, length = array3.length; i < length; ++i) {
                array2[i] = this.LIZ(array3[i]);
            }
        }
        return addIntentOptions;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.LIZ(this.LIZIZ.addSubMenu(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.LIZ(this.LIZIZ.addSubMenu(n, n2, n3, n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.LIZ(this.LIZIZ.addSubMenu(n, n2, n3, charSequence));
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.LIZ(this.LIZIZ.addSubMenu(charSequence));
    }
    
    public void clear() {
        this.LIZ();
        this.LIZIZ.clear();
    }
    
    public void close() {
        this.LIZIZ.close();
    }
    
    public MenuItem findItem(final int n) {
        return this.LIZ(this.LIZIZ.findItem(n));
    }
    
    public MenuItem getItem(final int n) {
        return this.LIZ(this.LIZIZ.getItem(n));
    }
    
    public boolean hasVisibleItems() {
        return this.LIZIZ.hasVisibleItems();
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.LIZIZ.isShortcutKey(n, keyEvent);
    }
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return this.LIZIZ.performIdentifierAction(n, n2);
    }
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        return this.LIZIZ.performShortcut(n, keyEvent, n2);
    }
    
    public void removeGroup(final int n) {
        this.LIZ(n);
        this.LIZIZ.removeGroup(n);
    }
    
    public void removeItem(final int n) {
        this.LIZIZ(n);
        this.LIZIZ.removeItem(n);
    }
    
    public void setGroupCheckable(final int n, final boolean b, final boolean b2) {
        this.LIZIZ.setGroupCheckable(n, b, b2);
    }
    
    public void setGroupEnabled(final int n, final boolean b) {
        this.LIZIZ.setGroupEnabled(n, b);
    }
    
    public void setGroupVisible(final int n, final boolean b) {
        this.LIZIZ.setGroupVisible(n, b);
    }
    
    public void setQwertyMode(final boolean qwertyMode) {
        this.LIZIZ.setQwertyMode(qwertyMode);
    }
    
    public int size() {
        return this.LIZIZ.size();
    }
}
