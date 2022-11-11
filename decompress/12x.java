// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import java.util.Collection;
import android.view.SubMenu;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.Iterator;
import android.view.KeyCharacterMap$KeyData;
import java.util.List;
import android.view.KeyEvent;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu$ContextMenuInfo;
import java.util.ArrayList;
import android.content.res.Resources;
import android.content.Context;

public class 12x implements 05n
{
    public static final int[] LJIILIIL;
    public final Context LIZ;
    public final Resources LIZIZ;
    public a LIZJ;
    public ArrayList<130> LIZLLL;
    public ArrayList<130> LJ;
    public int LJFF;
    public ContextMenu$ContextMenuInfo LJI;
    public CharSequence LJII;
    public Drawable LJIIIIZZ;
    public View LJIIIZ;
    public boolean LJIIJ;
    public 130 LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public ArrayList<130> LJIILLIIL;
    public boolean LJIIZILJ;
    public ArrayList<130> LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public ArrayList<130> LJJI;
    public CopyOnWriteArrayList<WeakReference<02r>> LJJIFFI;
    public boolean LJJII;
    
    static {
        Covode.recordClassIndex(348);
        LJIILIIL = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public 12x(final Context liz) {
        this.LJJI = new ArrayList<130>();
        this.LJJIFFI = new CopyOnWriteArrayList<WeakReference<02r>>();
        final boolean b = false;
        this.LJJII = false;
        this.LIZ = liz;
        final Resources resources = liz.getResources();
        this.LIZIZ = resources;
        this.LIZLLL = new ArrayList<130>();
        this.LJIILLIIL = new ArrayList<130>();
        this.LJIIZILJ = true;
        this.LJ = new ArrayList<130>();
        this.LJIJ = new ArrayList<130>();
        this.LJIJI = true;
        boolean ljiill = b;
        Label_0142: {
            if (resources.getConfiguration().keyboard != 1) {
                final ViewConfiguration value = ViewConfiguration.get(liz);
                if (Build$VERSION.SDK_INT >= 28) {
                    ljiill = b;
                    if (!value.shouldShowMenuShortcutsWhenKeyboardPresent()) {
                        break Label_0142;
                    }
                }
                else {
                    final Resources resources2 = liz.getResources();
                    final int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                    ljiill = b;
                    if (identifier == 0) {
                        break Label_0142;
                    }
                    ljiill = b;
                    if (!resources2.getBoolean(identifier)) {
                        break Label_0142;
                    }
                }
                ljiill = true;
            }
        }
        this.LJIILL = ljiill;
    }
    
    public static int LIZ(final ArrayList<130> list, final int n) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (((130)list.get(i)).LIZ <= n) {
                return i + 1;
            }
        }
        return 0;
    }
    
    private 130 LIZ(final int n, final KeyEvent keyEvent) {
        final ArrayList<130> ljji = this.LJJI;
        ljji.clear();
        this.LIZ(ljji, n, keyEvent);
        if (ljji.isEmpty()) {
            return null;
        }
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        keyEvent.getKeyData(keyCharacterMap$KeyData);
        final int size = ljji.size();
        if (size == 1) {
            return (130)ljji.get(0);
        }
        final boolean lizj = this.LIZJ();
        for (int i = 0; i < size; ++i) {
            final 130 130 = ljji.get(i);
            char c;
            if (lizj) {
                c = 130.getAlphabeticShortcut();
            }
            else {
                c = 130.getNumericShortcut();
            }
            if ((c == keyCharacterMap$KeyData.meta[0] && (metaState & 0x2) == 0x0) || (c == keyCharacterMap$KeyData.meta[2] && (metaState & 0x2) != 0x0) || (lizj && c == '\b' && n == 67)) {
                return 130;
            }
        }
        return null;
    }
    
    private void LIZ(final int n, final CharSequence ljii, final int n2, final Drawable ljiiiizz, final View ljiiiz) {
        final Resources liziz = this.LIZIZ;
        if (ljiiiz != null) {
            this.LJIIIZ = ljiiiz;
            this.LJII = null;
            this.LJIIIIZZ = null;
        }
        else {
            if (n > 0) {
                this.LJII = liziz.getText(n);
            }
            else if (ljii != null) {
                this.LJII = ljii;
            }
            if (n2 > 0) {
                this.LJIIIIZZ = this.LIZ.getDrawable(n2);
            }
            else if (ljiiiizz != null) {
                this.LJIIIIZZ = ljiiiizz;
            }
            this.LJIIIZ = null;
        }
        this.LIZIZ(false);
    }
    
    private void LIZ(final int n, final boolean b) {
        if (n >= 0 && n < this.LIZLLL.size()) {
            this.LIZLLL.remove(n);
            if (b) {
                this.LIZIZ(true);
            }
        }
    }
    
    private void LIZ(final List<130> list, final int n, final KeyEvent keyEvent) {
        final boolean lizj = this.LIZJ();
        final int modifiers = keyEvent.getModifiers();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (!keyEvent.getKeyData(keyCharacterMap$KeyData) && n != 67) {
            return;
        }
        for (int size = this.LIZLLL.size(), i = 0; i < size; ++i) {
            final 130 130 = this.LIZLLL.get(i);
            if (130.hasSubMenu()) {
                ((12x)130.getSubMenu()).LIZ(list, n, keyEvent);
            }
            char c;
            int n2;
            if (lizj) {
                c = 130.getAlphabeticShortcut();
                n2 = 130.getAlphabeticModifiers();
            }
            else {
                c = 130.getNumericShortcut();
                n2 = 130.getNumericModifiers();
            }
            if ((modifiers & 0x1100F) == (n2 & 0x1100F) && c != '\0' && (c == keyCharacterMap$KeyData.meta[0] || c == keyCharacterMap$KeyData.meta[2] || (lizj && c == '\b' && n == 67)) && 130.isEnabled()) {
                list.add(130);
            }
        }
    }
    
    private boolean LIZ(final 1fZ 1fZ, 02r 02r) {
        final boolean empty = this.LJJIFFI.isEmpty();
        boolean b = false;
        if (empty) {
            return false;
        }
        if (02r != null) {
            b = 02r.LIZ(1fZ);
        }
        for (final WeakReference weakReference : this.LJJIFFI) {
            02r = (02r)weakReference.get();
            if (02r == null) {
                this.LJJIFFI.remove(weakReference);
            }
            else {
                if (b) {
                    continue;
                }
                b = 02r.LIZ(1fZ);
            }
        }
        return b;
    }
    
    public final 12x LIZ(final int n) {
        this.LIZ(n, null, 0, null, null);
        return this;
    }
    
    public final 12x LIZ(final Drawable drawable) {
        this.LIZ(0, null, 0, drawable, null);
        return this;
    }
    
    public final 12x LIZ(final View view) {
        this.LIZ(0, null, 0, null, view);
        return this;
    }
    
    public final 12x LIZ(final CharSequence charSequence) {
        this.LIZ(0, charSequence, 0, null, null);
        return this;
    }
    
    public MenuItem LIZ(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final int n4 = (0xFFFF0000 & n3) >> 16;
        if (n4 >= 0) {
            final int[] ljiiliil = 12x.LJIILIIL;
            if (n4 < ljiiliil.length) {
                final int n5 = ljiiliil[n4] << 16 | (0xFFFF & n3);
                final 130 130 = new 130(this, n, n2, n3, n5, charSequence, this.LJFF);
                final ContextMenu$ContextMenuInfo lji = this.LJI;
                if (lji != null) {
                    130.LJI = lji;
                }
                final ArrayList<130> lizlll = this.LIZLLL;
                lizlll.add(LIZ(lizlll, n5), 130);
                this.LIZIZ(true);
                return (MenuItem)130;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }
    
    public String LIZ() {
        return "android:menu:actionviewstates";
    }
    
    public void LIZ(final a lizj) {
        this.LIZJ = lizj;
    }
    
    public final void LIZ(final 02r 02r) {
        this.LIZ(02r, this.LIZ);
    }
    
    public final void LIZ(final 02r 02r, final Context context) {
        this.LJJIFFI.add(new WeakReference<02r>(02r));
        02r.LIZ(context, this);
        this.LJIJI = true;
    }
    
    public final void LIZ(final Bundle bundle) {
        if (!this.LJJIFFI.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            for (final WeakReference weakReference : this.LJJIFFI) {
                final 02r 02r = (02r)weakReference.get();
                if (02r == null) {
                    this.LJJIFFI.remove(weakReference);
                }
                else {
                    final int liziz = 02r.LIZIZ();
                    if (liziz <= 0) {
                        continue;
                    }
                    final Parcelable ljff = 02r.LJFF();
                    if (ljff == null) {
                        continue;
                    }
                    sparseArray.put(liziz, (Object)ljff);
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }
    
    public final void LIZ(final boolean b) {
        if (this.LJJ) {
            return;
        }
        this.LJJ = true;
        for (final WeakReference weakReference : this.LJJIFFI) {
            final 02r 02r = (02r)weakReference.get();
            if (02r == null) {
                this.LJJIFFI.remove(weakReference);
            }
            else {
                02r.LIZ(this, b);
            }
        }
        this.LJJ = false;
    }
    
    public boolean LIZ(final 12x 12x, final MenuItem menuItem) {
        final a lizj = this.LIZJ;
        return lizj != null && lizj.LIZ(12x, menuItem);
    }
    
    public boolean LIZ(final 130 ljiijji) {
        final boolean empty = this.LJJIFFI.isEmpty();
        boolean liziz = false;
        if (empty) {
            return false;
        }
        this.LJ();
        final Iterator<WeakReference<02r>> iterator = this.LJJIFFI.iterator();
        boolean b;
        while (true) {
            b = liziz;
            if (!iterator.hasNext()) {
                break;
            }
            final WeakReference weakReference = iterator.next();
            final 02r 02r = (02r)weakReference.get();
            if (02r == null) {
                this.LJJIFFI.remove(weakReference);
            }
            else {
                b = (liziz = 02r.LIZIZ(ljiijji));
                if (b) {
                    break;
                }
                continue;
            }
        }
        this.LJFF();
        if (b) {
            this.LJIIJJI = ljiijji;
        }
        return b;
    }
    
    public final boolean LIZ(final MenuItem menuItem, final 02r 02r, final int n) {
        final 130 130 = (130)menuItem;
        if (130 == null || !130.isEnabled()) {
            return false;
        }
        final boolean liziz = 130.LIZIZ();
        final 07t ljff = 130.LJFF;
        boolean b;
        if (ljff != null && ljff.LIZJ()) {
            b = true;
        }
        else {
            b = false;
        }
        boolean b3;
        if (130.LJIIIZ()) {
            final boolean b2 = b3 = (liziz | 130.expandActionView());
            if (b2) {
                this.LIZ(true);
                b3 = b2;
            }
        }
        else if (130.hasSubMenu() || b) {
            if ((n & 0x4) == 0x0) {
                this.LIZ(false);
            }
            if (!130.hasSubMenu()) {
                130.LIZ(new 1fZ(this.LIZ, this, 130));
            }
            final 1fZ 1fZ = (1fZ)130.getSubMenu();
            if (b) {
                ljff.LIZ((SubMenu)1fZ);
            }
            final boolean b4 = b3 = (liziz | this.LIZ(1fZ, 02r));
            if (!b4) {
                this.LIZ(true);
                b3 = b4;
            }
        }
        else {
            b3 = liziz;
            if ((n & 0x1) == 0x0) {
                this.LIZ(true);
                b3 = liziz;
            }
        }
        return b3;
    }
    
    public final 12x LIZIZ(final int n) {
        this.LIZ(0, null, n, null, null);
        return this;
    }
    
    public final void LIZIZ(final 02r 02r) {
        for (final WeakReference weakReference : this.LJJIFFI) {
            final Object value = weakReference.get();
            if (value == null || value == 02r) {
                this.LJJIFFI.remove(weakReference);
            }
        }
    }
    
    public final void LIZIZ(final Bundle bundle) {
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.LJJIFFI.isEmpty()) {
            for (final WeakReference weakReference : this.LJJIFFI) {
                final 02r 02r = (02r)weakReference.get();
                if (02r == null) {
                    this.LJJIFFI.remove(weakReference);
                }
                else {
                    final int liziz = 02r.LIZIZ();
                    if (liziz <= 0) {
                        continue;
                    }
                    final Parcelable parcelable = (Parcelable)sparseParcelableArray.get(liziz);
                    if (parcelable == null) {
                        continue;
                    }
                    02r.LIZ(parcelable);
                }
            }
        }
    }
    
    public void LIZIZ(final boolean b) {
        if (!this.LJIJJ) {
            if (b) {
                this.LJIIZILJ = true;
                this.LJIJI = true;
            }
            if (!this.LJJIFFI.isEmpty()) {
                this.LJ();
                for (final WeakReference weakReference : this.LJJIFFI) {
                    final 02r 02r = (02r)weakReference.get();
                    if (02r == null) {
                        this.LJJIFFI.remove(weakReference);
                    }
                    else {
                        02r.LIZ(b);
                    }
                }
                this.LJFF();
            }
            return;
        }
        this.LJIJJLI = true;
        if (b) {
            this.LJIL = true;
        }
    }
    
    public boolean LIZIZ() {
        return this.LJJII;
    }
    
    public boolean LIZIZ(final 130 130) {
        final boolean empty = this.LJJIFFI.isEmpty();
        final boolean b = false;
        boolean b2 = false;
        if (!empty) {
            if (this.LJIIJJI != 130) {
                b2 = b2;
            }
            else {
                this.LJ();
                final Iterator<WeakReference<02r>> iterator = this.LJJIFFI.iterator();
                boolean lizj = b;
                boolean b3;
                while (true) {
                    b3 = lizj;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final WeakReference weakReference = iterator.next();
                    final 02r 02r = (02r)weakReference.get();
                    if (02r == null) {
                        this.LJJIFFI.remove(weakReference);
                    }
                    else {
                        b3 = (lizj = 02r.LIZJ(130));
                        if (b3) {
                            break;
                        }
                        continue;
                    }
                }
                this.LJFF();
                b2 = b3;
                if (b3) {
                    this.LJIIJJI = null;
                    b2 = b3;
                }
            }
        }
        return b2;
    }
    
    public final void LIZJ(final Bundle bundle) {
        final int size = this.size();
        SparseArray sparseArray = null;
        SparseArray sparseArray2;
        for (int i = 0; i < size; ++i, sparseArray = sparseArray2) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            sparseArray2 = sparseArray;
            if (actionView != null) {
                sparseArray2 = sparseArray;
                if (actionView.getId() != -1) {
                    SparseArray sparseArray3;
                    if ((sparseArray3 = sparseArray) == null) {
                        sparseArray3 = new SparseArray();
                    }
                    actionView.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (item.isActionViewExpanded()) {
                        bundle.putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((12x)item.getSubMenu()).LIZJ(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.LIZ(), sparseArray);
        }
    }
    
    public boolean LIZJ() {
        return this.LJIILJJIL;
    }
    
    public final void LIZLLL(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(this.LIZ());
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((12x)item.getSubMenu()).LIZLLL(bundle);
            }
        }
        final int int1 = bundle.getInt("android:menu:expandedactionview");
        if (int1 > 0) {
            final MenuItem item2 = this.findItem(int1);
            if (item2 != null) {
                item2.expandActionView();
            }
        }
    }
    
    public boolean LIZLLL() {
        return this.LJIILL;
    }
    
    public final void LJ() {
        if (!this.LJIJJ) {
            this.LJIJJ = true;
            this.LJIJJLI = false;
            this.LJIL = false;
        }
    }
    
    public final void LJFF() {
        this.LJIJJ = false;
        if (this.LJIJJLI) {
            this.LJIJJLI = false;
            this.LIZIZ(this.LJIL);
        }
    }
    
    public final void LJI() {
        this.LIZIZ(this.LJIIZILJ = true);
    }
    
    public final void LJII() {
        this.LIZIZ(this.LJIJI = true);
    }
    
    public final ArrayList<130> LJIIIIZZ() {
        if (!this.LJIIZILJ) {
            return this.LJIILLIIL;
        }
        this.LJIILLIIL.clear();
        for (int size = this.LIZLLL.size(), i = 0; i < size; ++i) {
            final 130 130 = this.LIZLLL.get(i);
            if (130.isVisible()) {
                this.LJIILLIIL.add(130);
            }
        }
        this.LJIIZILJ = false;
        this.LJIJI = true;
        return this.LJIILLIIL;
    }
    
    public final void LJIIIZ() {
        final ArrayList<130> ljiiiizz = this.LJIIIIZZ();
        if (!this.LJIJI) {
            return;
        }
        final Iterator<WeakReference<02r>> iterator = this.LJJIFFI.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final WeakReference weakReference = iterator.next();
            final 02r 02r = (02r)weakReference.get();
            if (02r == null) {
                this.LJJIFFI.remove(weakReference);
            }
            else {
                b |= 02r.LIZ();
            }
        }
        if (b) {
            this.LJ.clear();
            this.LJIJ.clear();
            for (int size = ljiiiizz.size(), i = 0; i < size; ++i) {
                final 130 130 = ljiiiizz.get(i);
                if (130.LJFF()) {
                    this.LJ.add(130);
                }
                else {
                    this.LJIJ.add(130);
                }
            }
        }
        else {
            this.LJ.clear();
            this.LJIJ.clear();
            this.LJIJ.addAll(this.LJIIIIZZ());
        }
        this.LJIJI = false;
    }
    
    public final ArrayList<130> LJIIJ() {
        this.LJIIIZ();
        return this.LJIJ;
    }
    
    public 12x LJIIJJI() {
        return this;
    }
    
    public MenuItem add(final int n) {
        return this.LIZ(0, 0, 0, this.LIZIZ.getString(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.LIZ(n, n2, n3, this.LIZIZ.getString(n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.LIZ(n, n2, n3, charSequence);
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.LIZ(0, 0, 0, charSequence);
    }
    
    public int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, final int n4, final MenuItem[] array2) {
        final PackageManager packageManager = this.LIZ.getPackageManager();
        final int n5 = 0;
        final List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, array, intent, 0);
        int size;
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        }
        else {
            size = 0;
        }
        int i = n5;
        if ((n4 & 0x1) == 0x0) {
            this.removeGroup(n);
            i = n5;
        }
        while (i < size) {
            final ResolveInfo resolveInfo = queryIntentActivityOptions.get(i);
            Intent intent2;
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[resolveInfo.specificIndex];
            }
            final Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            final MenuItem setIntent = this.add(n, n2, n3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (array2 != null && resolveInfo.specificIndex >= 0) {
                array2[resolveInfo.specificIndex] = setIntent;
            }
            ++i;
        }
        return size;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.LIZIZ.getString(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.LIZIZ.getString(n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final 130 130 = (130)this.LIZ(n, n2, n3, charSequence);
        final 1fZ 1fZ = new 1fZ(this.LIZ, this, 130);
        130.LIZ(1fZ);
        return (SubMenu)1fZ;
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    public void clear() {
        final 130 ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            this.LIZIZ(ljiijji);
        }
        this.LIZLLL.clear();
        this.LIZIZ(true);
    }
    
    public void clearHeader() {
        this.LJIIIIZZ = null;
        this.LJII = null;
        this.LJIIIZ = null;
        this.LIZIZ(false);
    }
    
    public void close() {
        this.LIZ(true);
    }
    
    public MenuItem findItem(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final 130 130 = this.LIZLLL.get(i);
            if (130.getItemId() == n) {
                return (MenuItem)130;
            }
            if (130.hasSubMenu()) {
                final MenuItem item = 130.getSubMenu().findItem(n);
                if (item != null) {
                    return item;
                }
            }
        }
        return null;
    }
    
    public MenuItem getItem(final int n) {
        return (MenuItem)this.LIZLLL.get(n);
    }
    
    public boolean hasVisibleItems() {
        if (this.LJIIL) {
            return true;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.LIZLLL.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.LIZ(n, keyEvent) != null;
    }
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return this.LIZ(this.findItem(n), null, n2);
    }
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final 130 liz = this.LIZ(n, keyEvent);
        final boolean b = liz != null && this.LIZ((MenuItem)liz, null, n2);
        if ((n2 & 0x2) != 0x0) {
            this.LIZ(true);
        }
        return b;
    }
    
    public void removeGroup(final int n) {
        final int size = this.size();
        int i = 0;
        while (i < size) {
            if (this.LIZLLL.get(i).getGroupId() == n) {
                if (i >= 0) {
                    for (int size2 = this.LIZLLL.size(), n2 = 0; n2 < size2 - i && this.LIZLLL.get(i).getGroupId() == n; ++n2) {
                        this.LIZ(i, false);
                    }
                    this.LIZIZ(true);
                    break;
                }
                break;
            }
            else {
                ++i;
            }
        }
    }
    
    public void removeItem(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                if (this.LIZLLL.get(i).getItemId() == n) {
                    this.LIZ(i, true);
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        for (int size = this.LIZLLL.size(), i = 0; i < size; ++i) {
            final 130 130 = this.LIZLLL.get(i);
            if (130.getGroupId() == n) {
                130.LIZ(b);
                130.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupDividerEnabled(final boolean ljjii) {
        this.LJJII = ljjii;
    }
    
    public void setGroupEnabled(final int n, final boolean enabled) {
        for (int size = this.LIZLLL.size(), i = 0; i < size; ++i) {
            final 130 130 = this.LIZLLL.get(i);
            if (130.getGroupId() == n) {
                130.setEnabled(enabled);
            }
        }
    }
    
    public void setGroupVisible(final int n, final boolean b) {
        final int size = this.LIZLLL.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final 130 130 = this.LIZLLL.get(i);
            int n3 = n2;
            if (130.getGroupId() == n) {
                n3 = n2;
                if (130.LIZIZ(b)) {
                    n3 = 1;
                }
            }
            ++i;
            n2 = n3;
        }
        if (n2 != 0) {
            this.LIZIZ(true);
        }
    }
    
    public void setQwertyMode(final boolean ljiiljjil) {
        this.LJIILJJIL = ljiiljjil;
        this.LIZIZ(false);
    }
    
    public int size() {
        return this.LIZLLL.size();
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(349);
        }
        
        void LIZ(final 12x p0);
        
        boolean LIZ(final 12x p0, final MenuItem p1);
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(350);
        }
        
        boolean LIZ(final 130 p0);
    }
}
