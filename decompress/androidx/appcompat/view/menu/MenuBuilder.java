// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.os.BaseBundle;
import android.view.Menu;
import a4.b;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.ActivityNotFoundException;
import android.util.Log;
import java.util.Collection;
import android.view.KeyCharacterMap$KeyData;
import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import a4.k1;
import android.view.ViewConfiguration;
import android.util.SparseArray;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.Iterator;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Context;
import java.util.ArrayList;
import t3.a;

public class MenuBuilder implements a
{
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder;
    private ArrayList<g> mActionItems;
    private MenuBuilder.MenuBuilder$a mCallback;
    private final Context mContext;
    private ContextMenu$ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private g mExpandedItem;
    private boolean mGroupDividerEnabled;
    public Drawable mHeaderIcon;
    public CharSequence mHeaderTitle;
    public View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList<g> mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList<g> mNonActionItems;
    private boolean mOptionalIconsVisible;
    private boolean mOverrideVisibleItems;
    private CopyOnWriteArrayList<WeakReference<i>> mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private boolean mStructureChangedWhileDispatchPrevented;
    private ArrayList<g> mTempShortcutItemList;
    private ArrayList<g> mVisibleItems;
    
    static {
        sCategoryToOrder = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public MenuBuilder(final Context mContext) {
        this.mDefaultShowAsAction = 0;
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        this.mOptionalIconsVisible = false;
        this.mIsClosing = false;
        this.mTempShortcutItemList = new ArrayList<g>();
        this.mPresenters = new CopyOnWriteArrayList<WeakReference<i>>();
        this.mGroupDividerEnabled = false;
        this.mContext = mContext;
        this.mResources = mContext.getResources();
        this.mItems = new ArrayList<g>();
        this.mVisibleItems = new ArrayList<g>();
        this.mIsVisibleItemsStale = true;
        this.mActionItems = new ArrayList<g>();
        this.mNonActionItems = new ArrayList<g>();
        this.setShortcutsVisibleInner(this.mIsActionItemsStale = true);
    }
    
    private g createNewMenuItem(final int n, final int n2, final int n3, final int n4, final CharSequence charSequence, final int n5) {
        return new g(this, n, n2, n3, n4, charSequence, n5);
    }
    
    private void dispatchPresenterUpdate(final boolean b) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        this.stopDispatchingItemsChanged();
        for (final WeakReference weakReference : this.mPresenters) {
            final i i = (i)weakReference.get();
            if (i == null) {
                this.mPresenters.remove(weakReference);
            }
            else {
                i.k();
            }
        }
        this.startDispatchingItemsChanged();
    }
    
    private void dispatchRestoreInstanceState(final Bundle bundle) {
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            if (!this.mPresenters.isEmpty()) {
                for (final WeakReference weakReference : this.mPresenters) {
                    final i i = (i)weakReference.get();
                    if (i == null) {
                        this.mPresenters.remove(weakReference);
                    }
                    else {
                        final int id = i.getId();
                        if (id <= 0) {
                            continue;
                        }
                        final Parcelable parcelable = (Parcelable)sparseParcelableArray.get(id);
                        if (parcelable == null) {
                            continue;
                        }
                        i.j(parcelable);
                    }
                }
            }
        }
    }
    
    private void dispatchSaveInstanceState(final Bundle bundle) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        final SparseArray sparseArray = new SparseArray();
        for (final WeakReference weakReference : this.mPresenters) {
            final i i = (i)weakReference.get();
            if (i == null) {
                this.mPresenters.remove(weakReference);
            }
            else {
                final int id = i.getId();
                if (id <= 0) {
                    continue;
                }
                final Parcelable c = i.c();
                if (c == null) {
                    continue;
                }
                sparseArray.put(id, (Object)c);
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }
    
    private boolean dispatchSubMenuSelected(final l l, final i i) {
        final boolean empty = this.mPresenters.isEmpty();
        boolean b = false;
        if (empty) {
            return false;
        }
        if (i != null) {
            b = i.l(l);
        }
        for (final WeakReference weakReference : this.mPresenters) {
            final i j = (i)weakReference.get();
            if (j == null) {
                this.mPresenters.remove(weakReference);
            }
            else {
                if (b) {
                    continue;
                }
                b = j.l(l);
            }
        }
        return b;
    }
    
    private static int findInsertIndex(final ArrayList<g> list, final int n) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (((g)list.get(i)).d <= n) {
                return i + 1;
            }
        }
        return 0;
    }
    
    private static int getOrdering(final int n) {
        final int n2 = (0xFFFF0000 & n) >> 16;
        if (n2 >= 0) {
            final int[] sCategoryToOrder = MenuBuilder.sCategoryToOrder;
            if (n2 < sCategoryToOrder.length) {
                return (n & 0xFFFF) | sCategoryToOrder[n2] << 16;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }
    
    private void removeItemAtInt(final int n, final boolean b) {
        if (n >= 0) {
            if (n < this.mItems.size()) {
                this.mItems.remove(n);
                if (b) {
                    this.onItemsChanged(true);
                }
            }
        }
    }
    
    private void setHeaderInternal(final int n, final CharSequence mHeaderTitle, final int n2, final Drawable mHeaderIcon, final View mHeaderView) {
        final Resources resources = this.getResources();
        if (mHeaderView != null) {
            this.mHeaderView = mHeaderView;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        }
        else {
            if (n > 0) {
                this.mHeaderTitle = resources.getText(n);
            }
            else if (mHeaderTitle != null) {
                this.mHeaderTitle = mHeaderTitle;
            }
            if (n2 > 0) {
                this.mHeaderIcon = n3.a.getDrawable(this.getContext(), n2);
            }
            else if (mHeaderIcon != null) {
                this.mHeaderIcon = mHeaderIcon;
            }
            this.mHeaderView = null;
        }
        this.onItemsChanged(false);
    }
    
    private void setShortcutsVisibleInner(final boolean b) {
        boolean mShortcutsVisible;
        final boolean b2 = mShortcutsVisible = false;
        if (b) {
            mShortcutsVisible = b2;
            if (this.mResources.getConfiguration().keyboard != 1) {
                final ViewConfiguration value = ViewConfiguration.get(this.mContext);
                final Context mContext = this.mContext;
                final Method a = k1.a;
                boolean b3;
                if (Build$VERSION.SDK_INT >= 28) {
                    b3 = k1.b.b(value);
                }
                else {
                    final Resources resources = mContext.getResources();
                    final int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                    b3 = (identifier != 0 && resources.getBoolean(identifier));
                }
                mShortcutsVisible = b2;
                if (b3) {
                    mShortcutsVisible = true;
                }
            }
        }
        this.mShortcutsVisible = mShortcutsVisible;
    }
    
    public MenuItem add(final int n) {
        return this.addInternal(0, 0, 0, this.mResources.getString(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.addInternal(n, n2, n3, this.mResources.getString(n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.addInternal(n, n2, n3, charSequence);
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.addInternal(0, 0, 0, charSequence);
    }
    
    public int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, int n4, final MenuItem[] array2) {
        final PackageManager packageManager = this.mContext.getPackageManager();
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
            n4 = resolveInfo.specificIndex;
            Intent intent2;
            if (n4 < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[n4];
            }
            final Intent intent3 = new Intent(intent2);
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            final MenuItem setIntent = this.add(n, n2, n3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (array2 != null) {
                n4 = resolveInfo.specificIndex;
                if (n4 >= 0) {
                    array2[n4] = setIntent;
                }
            }
            ++i;
        }
        return size;
    }
    
    public MenuItem addInternal(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final int ordering = getOrdering(n3);
        final g newMenuItem = this.createNewMenuItem(n, n2, n3, ordering, charSequence, this.mDefaultShowAsAction);
        final ContextMenu$ContextMenuInfo mCurrentMenuInfo = this.mCurrentMenuInfo;
        if (mCurrentMenuInfo != null) {
            newMenuItem.D = mCurrentMenuInfo;
        }
        final ArrayList<g> mItems = this.mItems;
        mItems.add(findInsertIndex(mItems, ordering), newMenuItem);
        this.onItemsChanged(true);
        return (MenuItem)newMenuItem;
    }
    
    public void addMenuPresenter(final i i) {
        this.addMenuPresenter(i, this.mContext);
    }
    
    public void addMenuPresenter(final i i, final Context context) {
        this.mPresenters.add(new WeakReference<i>(i));
        i.f(context, this);
        this.mIsActionItemsStale = true;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.mResources.getString(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.mResources.getString(n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final g g = (g)this.addInternal(n, n2, n3, charSequence);
        final l o = new l(this.mContext, this, g);
        (g.o = o).setHeaderTitle(g.e);
        return (SubMenu)o;
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    public void changeMenuMode() {
        final MenuBuilder.MenuBuilder$a mCallback = this.mCallback;
        if (mCallback != null) {
            mCallback.b(this);
        }
    }
    
    public void clear() {
        final g mExpandedItem = this.mExpandedItem;
        if (mExpandedItem != null) {
            this.collapseItemActionView(mExpandedItem);
        }
        this.mItems.clear();
        this.onItemsChanged(true);
    }
    
    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        this.clear();
        this.clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        this.onItemsChanged(true);
    }
    
    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        this.onItemsChanged(false);
    }
    
    public void close() {
        this.close(true);
    }
    
    public final void close(final boolean b) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (final WeakReference weakReference : this.mPresenters) {
            final i i = (i)weakReference.get();
            if (i == null) {
                this.mPresenters.remove(weakReference);
            }
            else {
                i.b(this, b);
            }
        }
        this.mIsClosing = false;
    }
    
    public boolean collapseItemActionView(final g g) {
        final boolean empty = this.mPresenters.isEmpty();
        final boolean b = false;
        final int n = 0;
        boolean b2 = b;
        if (!empty) {
            if (this.mExpandedItem != g) {
                b2 = b;
            }
            else {
                this.stopDispatchingItemsChanged();
                final Iterator<WeakReference<i>> iterator = this.mPresenters.iterator();
                boolean i = n != 0;
                boolean b3;
                while (true) {
                    b3 = i;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final WeakReference weakReference = iterator.next();
                    final i j = (i)weakReference.get();
                    if (j == null) {
                        this.mPresenters.remove(weakReference);
                    }
                    else {
                        b3 = (i = j.i(g));
                        if (b3) {
                            break;
                        }
                        continue;
                    }
                }
                this.startDispatchingItemsChanged();
                b2 = b3;
                if (b3) {
                    this.mExpandedItem = null;
                    b2 = b3;
                }
            }
        }
        return b2;
    }
    
    public boolean dispatchMenuItemSelected(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        final MenuBuilder.MenuBuilder$a mCallback = this.mCallback;
        return mCallback != null && mCallback.a(menuBuilder, menuItem);
    }
    
    public boolean expandItemActionView(final g mExpandedItem) {
        final boolean empty = this.mPresenters.isEmpty();
        boolean d = false;
        if (empty) {
            return false;
        }
        this.stopDispatchingItemsChanged();
        final Iterator<WeakReference<i>> iterator = this.mPresenters.iterator();
        boolean b;
        while (true) {
            b = d;
            if (!iterator.hasNext()) {
                break;
            }
            final WeakReference weakReference = iterator.next();
            final i i = (i)weakReference.get();
            if (i == null) {
                this.mPresenters.remove(weakReference);
            }
            else {
                b = (d = i.d(mExpandedItem));
                if (b) {
                    break;
                }
                continue;
            }
        }
        this.startDispatchingItemsChanged();
        if (b) {
            this.mExpandedItem = mExpandedItem;
        }
        return b;
    }
    
    public int findGroupIndex(final int n) {
        return this.findGroupIndex(n, 0);
    }
    
    public int findGroupIndex(final int n, final int n2) {
        final int size = this.size();
        int i = n2;
        if (n2 < 0) {
            i = 0;
        }
        while (i < size) {
            if (this.mItems.get(i).b == n) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public MenuItem findItem(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final g g = this.mItems.get(i);
            if (g.a == n) {
                return (MenuItem)g;
            }
            if (g.hasSubMenu()) {
                final MenuItem item = ((Menu)g.o).findItem(n);
                if (item != null) {
                    return item;
                }
            }
        }
        return null;
    }
    
    public int findItemIndex(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.mItems.get(i).a == n) {
                return i;
            }
        }
        return -1;
    }
    
    public g findItemWithShortcutForKey(final int n, final KeyEvent keyEvent) {
        final ArrayList<g> mTempShortcutItemList = this.mTempShortcutItemList;
        mTempShortcutItemList.clear();
        this.findItemsWithShortcutForKey(mTempShortcutItemList, n, keyEvent);
        if (mTempShortcutItemList.isEmpty()) {
            return null;
        }
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        keyEvent.getKeyData(keyCharacterMap$KeyData);
        final int size = mTempShortcutItemList.size();
        if (size == 1) {
            return (g)mTempShortcutItemList.get(0);
        }
        final boolean qwertyMode = this.isQwertyMode();
        for (int i = 0; i < size; ++i) {
            final g g = mTempShortcutItemList.get(i);
            char c;
            if (qwertyMode) {
                c = g.j;
            }
            else {
                c = g.h;
            }
            final char[] meta = keyCharacterMap$KeyData.meta;
            if ((c == meta[0] && (metaState & 0x2) == 0x0) || (c == meta[2] && (metaState & 0x2) != 0x0) || (qwertyMode && c == '\b' && n == 67)) {
                return g;
            }
        }
        return null;
    }
    
    public void findItemsWithShortcutForKey(final List<g> list, final int n, final KeyEvent keyEvent) {
        final boolean qwertyMode = this.isQwertyMode();
        final int modifiers = keyEvent.getModifiers();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (!keyEvent.getKeyData(keyCharacterMap$KeyData) && n != 67) {
            return;
        }
        for (int size = this.mItems.size(), i = 0; i < size; ++i) {
            final g g = this.mItems.get(i);
            if (g.hasSubMenu()) {
                ((MenuBuilder)g.o).findItemsWithShortcutForKey(list, n, keyEvent);
            }
            char c;
            if (qwertyMode) {
                c = g.j;
            }
            else {
                c = g.h;
            }
            int n2;
            if (qwertyMode) {
                n2 = g.k;
            }
            else {
                n2 = g.i;
            }
            if ((modifiers & 0x1100F) == (n2 & 0x1100F) && c != '\0') {
                final char[] meta = keyCharacterMap$KeyData.meta;
                if ((c == meta[0] || c == meta[2] || (qwertyMode && c == '\b' && n == 67)) && g.isEnabled()) {
                    list.add(g);
                }
            }
        }
    }
    
    public void flagActionItems() {
        final ArrayList<g> visibleItems = this.getVisibleItems();
        if (!this.mIsActionItemsStale) {
            return;
        }
        final Iterator<WeakReference<i>> iterator = this.mPresenters.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final WeakReference weakReference = iterator.next();
            final i i = (i)weakReference.get();
            if (i == null) {
                this.mPresenters.remove(weakReference);
            }
            else {
                b |= i.e();
            }
        }
        if (b) {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            for (int size = visibleItems.size(), j = 0; j < size; ++j) {
                final g g = visibleItems.get(j);
                if ((g.x & 0x20) == 0x20) {
                    this.mActionItems.add(g);
                }
                else {
                    this.mNonActionItems.add(g);
                }
            }
        }
        else {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            this.mNonActionItems.addAll(this.getVisibleItems());
        }
        this.mIsActionItemsStale = false;
    }
    
    public ArrayList<g> getActionItems() {
        this.flagActionItems();
        return this.mActionItems;
    }
    
    public String getActionViewStatesKey() {
        return "android:menu:actionviewstates";
    }
    
    public Context getContext() {
        return this.mContext;
    }
    
    public g getExpandedItem() {
        return this.mExpandedItem;
    }
    
    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }
    
    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }
    
    public View getHeaderView() {
        return this.mHeaderView;
    }
    
    public MenuItem getItem(final int n) {
        return (MenuItem)this.mItems.get(n);
    }
    
    public ArrayList<g> getNonActionItems() {
        this.flagActionItems();
        return this.mNonActionItems;
    }
    
    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }
    
    public Resources getResources() {
        return this.mResources;
    }
    
    public MenuBuilder getRootMenu() {
        return this;
    }
    
    public ArrayList<g> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        for (int size = this.mItems.size(), i = 0; i < size; ++i) {
            final g g = this.mItems.get(i);
            if (g.isVisible()) {
                this.mVisibleItems.add(g);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }
    
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }
    
    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.findItemWithShortcutForKey(n, keyEvent) != null;
    }
    
    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }
    
    public void onItemActionRequestChanged(final g g) {
        this.onItemsChanged(this.mIsActionItemsStale = true);
    }
    
    public void onItemVisibleChanged(final g g) {
        this.onItemsChanged(this.mIsVisibleItemsStale = true);
    }
    
    public void onItemsChanged(final boolean b) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (b) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            this.dispatchPresenterUpdate(b);
        }
        else {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (b) {
                this.mStructureChangedWhileDispatchPrevented = true;
            }
        }
    }
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return this.performItemAction(this.findItem(n), n2);
    }
    
    public boolean performItemAction(final MenuItem menuItem, final int n) {
        return this.performItemAction(menuItem, null, n);
    }
    
    public boolean performItemAction(MenuItem menuItem, final i i, final int n) {
        menuItem = menuItem;
        if (menuItem != null && ((g)menuItem).isEnabled()) {
            final MenuItem$OnMenuItemClickListener p3 = ((g)menuItem).p;
            int n3 = 0;
            Label_0130: {
                Label_0121: {
                    if (p3 == null || !p3.onMenuItemClick(menuItem)) {
                        final MenuBuilder n2 = ((g)menuItem).n;
                        if (!n2.dispatchMenuItemSelected(n2, menuItem)) {
                            if (((g)menuItem).g != null) {
                                try {
                                    ((g)menuItem).n.getContext().startActivity(((g)menuItem).g);
                                    break Label_0121;
                                }
                                catch (final ActivityNotFoundException ex) {
                                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)ex);
                                }
                            }
                            final b a = ((g)menuItem).A;
                            if (a == null || !a.e()) {
                                n3 = 0;
                                break Label_0130;
                            }
                        }
                    }
                }
                n3 = 1;
            }
            final b a2 = ((g)menuItem).A;
            final boolean b = a2 != null && a2.a();
            int n4;
            if (((g)menuItem).e()) {
                final boolean b2 = (n4 = (n3 | (((g)menuItem).expandActionView() ? 1 : 0))) != 0;
                if (b2) {
                    this.close(true);
                    n4 = (b2 ? 1 : 0);
                }
            }
            else if (!((g)menuItem).hasSubMenu() && !b) {
                n4 = n3;
                if ((n & 0x1) == 0x0) {
                    this.close(true);
                    n4 = n3;
                }
            }
            else {
                if ((n & 0x4) == 0x0) {
                    this.close(false);
                }
                if (!((g)menuItem).hasSubMenu()) {
                    (((g)menuItem).o = new l(this.getContext(), this, (g)menuItem)).setHeaderTitle(((g)menuItem).e);
                }
                final l o = ((g)menuItem).o;
                if (b) {
                    a2.f(o);
                }
                final boolean b3 = (n4 = (n3 | (this.dispatchSubMenuSelected(o, i) ? 1 : 0))) != 0;
                if (!b3) {
                    this.close(true);
                    n4 = (b3 ? 1 : 0);
                }
            }
            return n4 != 0;
        }
        return false;
    }
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final g itemWithShortcutForKey = this.findItemWithShortcutForKey(n, keyEvent);
        final boolean b = itemWithShortcutForKey != null && this.performItemAction((MenuItem)itemWithShortcutForKey, n2);
        if ((n2 & 0x2) != 0x0) {
            this.close(true);
        }
        return b;
    }
    
    public void removeGroup(final int n) {
        final int groupIndex = this.findGroupIndex(n);
        if (groupIndex >= 0) {
            for (int size = this.mItems.size(), n2 = 0; n2 < size - groupIndex && this.mItems.get(groupIndex).b == n; ++n2) {
                this.removeItemAtInt(groupIndex, false);
            }
            this.onItemsChanged(true);
        }
    }
    
    public void removeItem(final int n) {
        this.removeItemAtInt(this.findItemIndex(n), true);
    }
    
    public void removeItemAt(final int n) {
        this.removeItemAtInt(n, true);
    }
    
    public void removeMenuPresenter(final i i) {
        for (final WeakReference weakReference : this.mPresenters) {
            final i j = (i)weakReference.get();
            if (j == null || j == i) {
                this.mPresenters.remove(weakReference);
            }
        }
    }
    
    public void restoreActionViewStates(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(this.getActionViewStatesKey());
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((MenuBuilder)item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        final int int1 = ((BaseBundle)bundle).getInt("android:menu:expandedactionview");
        if (int1 > 0) {
            final MenuItem item2 = this.findItem(int1);
            if (item2 != null) {
                item2.expandActionView();
            }
        }
    }
    
    public void restorePresenterStates(final Bundle bundle) {
        this.dispatchRestoreInstanceState(bundle);
    }
    
    public void saveActionViewStates(final Bundle bundle) {
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
                        ((BaseBundle)bundle).putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((MenuBuilder)item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.getActionViewStatesKey(), sparseArray);
        }
    }
    
    public void savePresenterStates(final Bundle bundle) {
        this.dispatchSaveInstanceState(bundle);
    }
    
    public void setCallback(final MenuBuilder.MenuBuilder$a mCallback) {
        this.mCallback = mCallback;
    }
    
    public void setCurrentMenuInfo(final ContextMenu$ContextMenuInfo mCurrentMenuInfo) {
        this.mCurrentMenuInfo = mCurrentMenuInfo;
    }
    
    public MenuBuilder setDefaultShowAsAction(final int mDefaultShowAsAction) {
        this.mDefaultShowAsAction = mDefaultShowAsAction;
        return this;
    }
    
    public void setExclusiveItemChecked(final MenuItem menuItem) {
        final int groupId = menuItem.getGroupId();
        final int size = this.mItems.size();
        this.stopDispatchingItemsChanged();
        for (int i = 0; i < size; ++i) {
            final g g = this.mItems.get(i);
            if (g.b == groupId) {
                final int x = g.x;
                final int n = 1;
                if ((x & 0x4) != 0x0) {
                    if (g.isCheckable()) {
                        int n2;
                        if (g == menuItem) {
                            n2 = n;
                        }
                        else {
                            n2 = 0;
                        }
                        final int x2 = g.x;
                        int n3;
                        if (n2 != 0) {
                            n3 = 2;
                        }
                        else {
                            n3 = 0;
                        }
                        final int x3 = n3 | (x2 & 0xFFFFFFFD);
                        g.x = x3;
                        if (x2 != x3) {
                            g.n.onItemsChanged(false);
                        }
                    }
                }
            }
        }
        this.startDispatchingItemsChanged();
    }
    
    public void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        for (int size = this.mItems.size(), i = 0; i < size; ++i) {
            final g g = this.mItems.get(i);
            if (g.b == n) {
                final int x = g.x;
                int n2;
                if (b) {
                    n2 = 4;
                }
                else {
                    n2 = 0;
                }
                g.x = ((x & 0xFFFFFFFB) | n2);
                g.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupDividerEnabled(final boolean mGroupDividerEnabled) {
        this.mGroupDividerEnabled = mGroupDividerEnabled;
    }
    
    public void setGroupEnabled(final int n, final boolean enabled) {
        for (int size = this.mItems.size(), i = 0; i < size; ++i) {
            final g g = this.mItems.get(i);
            if (g.b == n) {
                g.setEnabled(enabled);
            }
        }
    }
    
    public void setGroupVisible(final int n, final boolean b) {
        int n2;
        int n3;
        for (int size = this.mItems.size(), i = n2 = 0; i < size; ++i, n2 = n3) {
            final g g = this.mItems.get(i);
            n3 = n2;
            if (g.b == n) {
                final int x = g.x;
                int n4;
                if (b) {
                    n4 = 0;
                }
                else {
                    n4 = 8;
                }
                final int x2 = (x & 0xFFFFFFF7) | n4;
                g.x = x2;
                final boolean b2 = x != x2;
                n3 = n2;
                if (b2) {
                    n3 = 1;
                }
            }
        }
        if (n2 != 0) {
            this.onItemsChanged(true);
        }
    }
    
    public MenuBuilder setHeaderIconInt(final int n) {
        this.setHeaderInternal(0, null, n, null, null);
        return this;
    }
    
    public MenuBuilder setHeaderIconInt(final Drawable drawable) {
        this.setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }
    
    public MenuBuilder setHeaderTitleInt(final int n) {
        this.setHeaderInternal(n, null, 0, null, null);
        return this;
    }
    
    public MenuBuilder setHeaderTitleInt(final CharSequence charSequence) {
        this.setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }
    
    public MenuBuilder setHeaderViewInt(final View view) {
        this.setHeaderInternal(0, null, 0, null, view);
        return this;
    }
    
    public void setOptionalIconsVisible(final boolean mOptionalIconsVisible) {
        this.mOptionalIconsVisible = mOptionalIconsVisible;
    }
    
    public void setOverrideVisibleItems(final boolean mOverrideVisibleItems) {
        this.mOverrideVisibleItems = mOverrideVisibleItems;
    }
    
    public void setQwertyMode(final boolean mQwertyMode) {
        this.mQwertyMode = mQwertyMode;
        this.onItemsChanged(false);
    }
    
    public void setShortcutsVisible(final boolean shortcutsVisibleInner) {
        if (this.mShortcutsVisible == shortcutsVisibleInner) {
            return;
        }
        this.setShortcutsVisibleInner(shortcutsVisibleInner);
        this.onItemsChanged(false);
    }
    
    public int size() {
        return this.mItems.size();
    }
    
    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            this.onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }
    
    public void stopDispatchingItemsChanged() {
        if (!this.mPreventDispatchingItemsChanged) {
            this.mPreventDispatchingItemsChanged = true;
            this.mItemsChangedWhileDispatchPrevented = false;
            this.mStructureChangedWhileDispatchPrevented = false;
        }
    }
}
