// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.os.BaseBundle;
import android.content.pm.ComponentInfo;
import android.net.Uri$Builder;
import java.io.InputStream;
import java.io.IOException;
import android.content.res.Resources$NotFoundException;
import n3.a;
import java.util.List;
import android.content.res.Resources;
import java.io.FileNotFoundException;
import android.net.Uri;
import android.view.ViewGroup;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import android.util.TypedValue;
import android.text.TextUtils;
import android.view.View;
import android.util.Log;
import android.database.Cursor;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.content.Context;
import android.app.SearchableInfo;
import android.view.View$OnClickListener;
import f4.c;

public final class t0 extends c implements View$OnClickListener
{
    public int A;
    public int B;
    public final SearchView p;
    public final SearchableInfo q;
    public final Context r;
    public final WeakHashMap<String, Drawable$ConstantState> s;
    public final int t;
    public int u;
    public ColorStateList v;
    public int w;
    public int x;
    public int y;
    public int z;
    
    public t0(final Context r, final SearchView p4, final SearchableInfo q, final WeakHashMap<String, Drawable$ConstantState> s) {
        super(r, p4.getSuggestionRowLayout());
        this.u = 1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.p = p4;
        this.q = q;
        this.t = p4.getSuggestionCommitIconResId();
        this.r = r;
        this.s = s;
    }
    
    public static String i(final Cursor cursor, final int n) {
        if (n == -1) {
            return null;
        }
        try {
            return cursor.getString(n);
        }
        catch (final Exception ex) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)ex);
            return null;
        }
    }
    
    public final void b(final View view, final Cursor cursor) {
        final t0.t0$a t0$a = (t0.t0$a)view.getTag();
        final int b = this.B;
        int int1;
        if (b != -1) {
            int1 = cursor.getInt(b);
        }
        else {
            int1 = 0;
        }
        if (t0$a.a != null) {
            final String i = i(cursor, this.w);
            final TextView a = t0$a.a;
            a.setText((CharSequence)i);
            if (TextUtils.isEmpty((CharSequence)i)) {
                ((View)a).setVisibility(8);
            }
            else {
                ((View)a).setVisibility(0);
            }
        }
        if (t0$a.b != null) {
            final String j = i(cursor, this.y);
            Object k;
            if (j != null) {
                if (this.v == null) {
                    final TypedValue typedValue = new TypedValue();
                    this.r.getTheme().resolveAttribute(2130969952, typedValue, true);
                    this.v = this.r.getResources().getColorStateList(typedValue.resourceId);
                }
                k = new SpannableString((CharSequence)j);
                ((SpannableString)k).setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, this.v, (ColorStateList)null), 0, j.length(), 33);
            }
            else {
                k = i(cursor, this.x);
            }
            if (TextUtils.isEmpty((CharSequence)k)) {
                final TextView a2 = t0$a.a;
                if (a2 != null) {
                    a2.setSingleLine(false);
                    t0$a.a.setMaxLines(2);
                }
            }
            else {
                final TextView a3 = t0$a.a;
                if (a3 != null) {
                    a3.setSingleLine(true);
                    t0$a.a.setMaxLines(1);
                }
            }
            final TextView b2 = t0$a.b;
            b2.setText((CharSequence)k);
            if (TextUtils.isEmpty((CharSequence)k)) {
                ((View)b2).setVisibility(8);
            }
            else {
                ((View)b2).setVisibility(0);
            }
        }
        final ImageView c = t0$a.c;
        if (c != null) {
            final int z = this.z;
            Drawable imageDrawable;
            if (z == -1) {
                imageDrawable = null;
            }
            else {
                imageDrawable = this.g(cursor.getString(z));
                if (imageDrawable == null) {
                    final ComponentName searchActivity = this.q.getSearchActivity();
                    final String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.s.containsKey(flattenToShortString)) {
                        final Drawable$ConstantState drawable$ConstantState = this.s.get(flattenToShortString);
                        if (drawable$ConstantState == null) {
                            imageDrawable = null;
                        }
                        else {
                            imageDrawable = drawable$ConstantState.newDrawable(this.r.getResources());
                        }
                    }
                    else {
                        final PackageManager packageManager = this.r.getPackageManager();
                        Label_0519: {
                            try {
                                final ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                                final int iconResource = ((ComponentInfo)activityInfo).getIconResource();
                                if (iconResource != 0) {
                                    if ((imageDrawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo)) != null) {
                                        break Label_0519;
                                    }
                                    final StringBuilder p2 = d.p("Invalid icon resource ", iconResource, " for ");
                                    p2.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", p2.toString());
                                }
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                Log.w("SuggestionsAdapter", ex.toString());
                            }
                            imageDrawable = null;
                        }
                        Drawable$ConstantState constantState;
                        if (imageDrawable == null) {
                            constantState = null;
                        }
                        else {
                            constantState = imageDrawable.getConstantState();
                        }
                        this.s.put(flattenToShortString, constantState);
                    }
                    if (imageDrawable == null) {
                        imageDrawable = this.r.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            c.setImageDrawable(imageDrawable);
            if (imageDrawable == null) {
                c.setVisibility(4);
            }
            else {
                c.setVisibility(0);
                imageDrawable.setVisible(false, false);
                imageDrawable.setVisible(true, false);
            }
        }
        final ImageView d = t0$a.d;
        if (d != null) {
            final int a4 = this.A;
            Drawable g;
            if (a4 == -1) {
                g = null;
            }
            else {
                g = this.g(cursor.getString(a4));
            }
            d.setImageDrawable(g);
            if (g == null) {
                d.setVisibility(8);
            }
            else {
                d.setVisibility(0);
                g.setVisible(false, false);
                g.setVisible(true, false);
            }
        }
        final int u = this.u;
        if (u != 2 && (u != 1 || (int1 & 0x1) == 0x0)) {
            t0$a.e.setVisibility(8);
        }
        else {
            t0$a.e.setVisibility(0);
            ((View)t0$a.e).setTag((Object)t0$a.a.getText());
            ((View)t0$a.e).setOnClickListener((View$OnClickListener)this);
        }
    }
    
    public final void c(final Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.w = cursor.getColumnIndex("suggest_text_1");
                this.x = cursor.getColumnIndex("suggest_text_2");
                this.y = cursor.getColumnIndex("suggest_text_2_url");
                this.z = cursor.getColumnIndex("suggest_icon_1");
                this.A = cursor.getColumnIndex("suggest_icon_2");
                this.B = cursor.getColumnIndex("suggest_flags");
            }
        }
        catch (final Exception ex) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", (Throwable)ex);
        }
    }
    
    public final String d(final Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        final String i = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i != null) {
            return i;
        }
        if (this.q.shouldRewriteQueryFromData()) {
            final String j = i(cursor, cursor.getColumnIndex("suggest_intent_data"));
            if (j != null) {
                return j;
            }
        }
        if (this.q.shouldRewriteQueryFromText()) {
            final String k = i(cursor, cursor.getColumnIndex("suggest_text_1"));
            if (k != null) {
                return k;
            }
        }
        return null;
    }
    
    public final View e(final ViewGroup viewGroup) {
        final View inflate = super.o.inflate(super.m, viewGroup, false);
        inflate.setTag((Object)new t0.t0$a(inflate));
        ((ImageView)inflate.findViewById(2131428813)).setImageResource(this.t);
        return inflate;
    }
    
    public final Drawable f(final Uri uri) throws FileNotFoundException {
        final String authority = uri.getAuthority();
        if (!TextUtils.isEmpty((CharSequence)authority)) {
            try {
                final Resources resourcesForApplication = this.r.getPackageManager().getResourcesForApplication(authority);
                final List pathSegments = uri.getPathSegments();
                if (pathSegments == null) {
                    throw new FileNotFoundException(s0.k("No path: ", uri));
                }
                final int size = pathSegments.size();
                int n = 0;
                Label_0120: {
                    if (size == 1) {
                        try {
                            n = Integer.parseInt(pathSegments.get(0));
                            break Label_0120;
                        }
                        catch (final NumberFormatException ex) {
                            throw new FileNotFoundException(s0.k("Single path segment is not a resource ID: ", uri));
                        }
                    }
                    if (size != 2) {
                        throw new FileNotFoundException(s0.k("More than two path segments: ", uri));
                    }
                    n = resourcesForApplication.getIdentifier((String)pathSegments.get(1), (String)pathSegments.get(0), authority);
                }
                if (n != 0) {
                    return resourcesForApplication.getDrawable(n);
                }
                throw new FileNotFoundException(s0.k("No resource found for: ", uri));
            }
            catch (final PackageManager$NameNotFoundException ex2) {
                throw new FileNotFoundException(s0.k("No package found for authority: ", uri));
            }
        }
        throw new FileNotFoundException(s0.k("No authority: ", uri));
    }
    
    public final Drawable g(final String s) {
        final Drawable drawable = null;
        final Drawable drawable2 = null;
        Drawable drawable3 = drawable;
        if (s != null) {
            drawable3 = drawable;
            if (!s.isEmpty()) {
                if ("0".equals(s)) {
                    drawable3 = drawable;
                }
                else {
                    try {
                        final int int1 = Integer.parseInt(s);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("android.resource://");
                        sb.append(this.r.getPackageName());
                        sb.append("/");
                        sb.append(int1);
                        final String string = sb.toString();
                        final Drawable$ConstantState drawable$ConstantState = this.s.get(string);
                        Drawable drawable4;
                        if (drawable$ConstantState == null) {
                            drawable4 = null;
                        }
                        else {
                            drawable4 = drawable$ConstantState.newDrawable();
                        }
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        final Drawable drawable5 = n3.a.getDrawable(this.r, int1);
                        if (drawable5 != null) {
                            this.s.put(string, drawable5.getConstantState());
                        }
                        return drawable5;
                    }
                    catch (final Resources$NotFoundException ex) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Icon resource not found: ");
                        sb2.append(s);
                        Log.w("SuggestionsAdapter", sb2.toString());
                        return null;
                    }
                    catch (final NumberFormatException ex2) {
                        final Drawable$ConstantState drawable$ConstantState2 = this.s.get(s);
                        Drawable drawable6;
                        if (drawable$ConstantState2 == null) {
                            drawable6 = null;
                        }
                        else {
                            drawable6 = drawable$ConstantState2.newDrawable();
                        }
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        final Uri parse = Uri.parse(s);
                        Drawable f = null;
                        Label_0525: {
                            try {
                                if ("android.resource".equals(parse.getScheme())) {
                                    try {
                                        f = this.f(parse);
                                        break Label_0525;
                                    }
                                    catch (final Resources$NotFoundException ex3) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Resource does not exist: ");
                                        sb3.append(parse);
                                        throw new FileNotFoundException(sb3.toString());
                                    }
                                }
                                final InputStream openInputStream = this.r.getContentResolver().openInputStream(parse);
                                if (openInputStream != null) {
                                    try {
                                        Drawable.createFromStream(openInputStream, (String)null);
                                        break Label_0525;
                                    }
                                    finally {
                                        try {
                                            openInputStream.close();
                                        }
                                        catch (final IOException ex4) {
                                            final StringBuilder sb4 = new StringBuilder();
                                            sb4.append("Error closing icon stream for ");
                                            sb4.append(parse);
                                            Log.e("SuggestionsAdapter", sb4.toString(), (Throwable)ex4);
                                        }
                                    }
                                }
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("Failed to open ");
                                sb5.append(parse);
                                throw new FileNotFoundException(sb5.toString());
                            }
                            catch (final FileNotFoundException ex5) {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("Icon not found: ");
                                sb6.append(parse);
                                sb6.append(", ");
                                sb6.append(ex5.getMessage());
                                Log.w("SuggestionsAdapter", sb6.toString());
                                f = drawable2;
                            }
                        }
                        drawable3 = f;
                        if (f != null) {
                            this.s.put(s, f.getConstantState());
                            drawable3 = f;
                        }
                    }
                }
            }
        }
        return drawable3;
    }
    
    public final View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
        try {
            dropDownView = super.getDropDownView(n, dropDownView, viewGroup);
            return dropDownView;
        }
        catch (final RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            final View inflate = super.o.inflate(super.n, viewGroup, false);
            if (inflate != null) {
                ((t0.t0$a)inflate.getTag()).a.setText((CharSequence)ex.toString());
            }
            return inflate;
        }
    }
    
    public final View getView(final int n, View view, final ViewGroup viewGroup) {
        try {
            view = super.getView(n, view, viewGroup);
            return view;
        }
        catch (final RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            final View e = this.e(viewGroup);
            ((t0.t0$a)e.getTag()).a.setText((CharSequence)ex.toString());
            return e;
        }
    }
    
    public final Cursor h(final SearchableInfo searchableInfo, final String s) {
        final String[] array = null;
        if (searchableInfo == null) {
            return null;
        }
        final String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        final Uri$Builder fragment = new Uri$Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        final String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        final String suggestSelection = searchableInfo.getSuggestSelection();
        String[] array2;
        if (suggestSelection != null) {
            array2 = new String[] { s };
        }
        else {
            fragment.appendPath(s);
            array2 = array;
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.r.getContentResolver().query(fragment.build(), (String[])null, suggestSelection, array2, (String)null);
    }
    
    public final boolean hasStableIds() {
        return false;
    }
    
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        final Cursor h = super.h;
        Object extras;
        if (h != null) {
            extras = h.getExtras();
        }
        else {
            extras = null;
        }
        if (extras != null) {
            ((BaseBundle)extras).getBoolean("in_progress");
        }
    }
    
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        final Cursor h = super.h;
        Object extras;
        if (h != null) {
            extras = h.getExtras();
        }
        else {
            extras = null;
        }
        if (extras != null) {
            ((BaseBundle)extras).getBoolean("in_progress");
        }
    }
    
    public final void onClick(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.p.j((CharSequence)tag);
        }
    }
}
