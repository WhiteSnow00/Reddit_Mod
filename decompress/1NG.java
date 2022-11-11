// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.content.ContentResolver;
import android.net.Uri$Builder;
import android.os.Bundle;
import java.util.List;
import android.content.res.Resources;
import java.io.FileNotFoundException;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.ImageView;
import android.database.Cursor;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import android.content.res.Resources$NotFoundException;
import android.net.Uri;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.content.ComponentName;
import com.bytedance.covode.number.Covode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.content.Context;
import android.app.SearchableInfo;
import android.view.View$OnClickListener;

public final class 1nG extends 1fr implements View$OnClickListener
{
    public int LIZ;
    public final 13L LJIIL;
    public final SearchableInfo LJIILIIL;
    public final Context LJIILJJIL;
    public final WeakHashMap<String, Drawable$ConstantState> LJIILL;
    public final int LJIILLIIL;
    public boolean LJIIZILJ;
    public ColorStateList LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    
    static {
        Covode.recordClassIndex(494);
    }
    
    public 1nG(final Context ljiiljjil, final 13L ljiil, final SearchableInfo ljiiliil, final WeakHashMap<String, Drawable$ConstantState> ljiill) {
        super(ljiiljjil, ljiil.getSuggestionRowLayout());
        this.LJIIZILJ = false;
        this.LIZ = 1;
        this.LJIJI = -1;
        this.LJIJJ = -1;
        this.LJIJJLI = -1;
        this.LJIL = -1;
        this.LJJ = -1;
        this.LJJI = -1;
        LIZ(super.LJ, "search");
        this.LJIIL = ljiil;
        this.LJIILIIL = ljiiliil;
        this.LJIILLIIL = ljiil.getSuggestionCommitIconResId();
        this.LJIILJJIL = ljiiljjil;
        this.LJIILL = ljiill;
    }
    
    private Drawable LIZ(final ComponentName componentName) {
        final PackageManager packageManager = super.LJ.getPackageManager();
        try {
            final ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            final int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            final Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                return null;
            }
            return drawable;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    private Drawable LIZ(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_1        
        //     3: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //     6: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //     9: ifeq            38
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   X/1nG.LIZIZ:(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
        //    17: areturn        
        //    18: astore_2       
        //    19: new             Ljava/io/FileNotFoundException;
        //    22: astore_2       
        //    23: aload_2        
        //    24: ldc             "Resource does not exist: "
        //    26: aload_1        
        //    27: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    30: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    33: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //    36: aload_2        
        //    37: athrow         
        //    38: aload_0        
        //    39: getfield        X/1nG.LJIILJJIL:Landroid/content/Context;
        //    42: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    45: aload_1        
        //    46: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    49: astore_2       
        //    50: aload_2        
        //    51: ifnull          73
        //    54: aload_2        
        //    55: aconst_null    
        //    56: invokestatic    android/graphics/drawable/Drawable.createFromStream:(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
        //    59: astore_1       
        //    60: aload_2        
        //    61: invokevirtual   java/io/InputStream.close:()V
        //    64: aload_1        
        //    65: areturn        
        //    66: astore_1       
        //    67: aload_2        
        //    68: invokevirtual   java/io/InputStream.close:()V
        //    71: aload_1        
        //    72: athrow         
        //    73: new             Ljava/io/FileNotFoundException;
        //    76: astore_2       
        //    77: aload_2        
        //    78: ldc             "Failed to open "
        //    80: aload_1        
        //    81: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    84: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    87: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //    90: aload_2        
        //    91: athrow         
        //    92: astore_1       
        //    93: aconst_null    
        //    94: areturn        
        //    95: astore_2       
        //    96: goto            64
        //    99: astore_2       
        //   100: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      12     92     95     Ljava/io/FileNotFoundException;
        //  12     18     18     38     Landroid/content/res/Resources$NotFoundException;
        //  12     18     92     95     Ljava/io/FileNotFoundException;
        //  19     38     92     95     Ljava/io/FileNotFoundException;
        //  38     50     92     95     Ljava/io/FileNotFoundException;
        //  54     60     66     73     Any
        //  60     64     95     99     Ljava/io/IOException;
        //  60     64     92     95     Ljava/io/FileNotFoundException;
        //  67     71     99     103    Ljava/io/IOException;
        //  67     71     92     95     Ljava/io/FileNotFoundException;
        //  71     73     92     95     Ljava/io/FileNotFoundException;
        //  73     92     92     95     Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 58, Size: 58
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private Drawable LIZ(final String s) {
        Drawable liz;
        final Drawable drawable = liz = null;
        if (s != null) {
            liz = drawable;
            if (!s.isEmpty()) {
                if ("0".equals(s)) {
                    liz = drawable;
                }
                else {
                    try {
                        final int int1 = Integer.parseInt(s);
                        final StringBuilder sb = new StringBuilder("android.resource://");
                        sb.append(this.LJIILJJIL.getPackageName());
                        sb.append("/");
                        sb.append(int1);
                        final String string = sb.toString();
                        if (this.LIZIZ(string) != null) {
                            goto Label_0140;
                        }
                        this.LIZ(string, this.LJIILJJIL.getDrawable(int1));
                        goto Label_0142;
                    }
                    catch (final NumberFormatException ex) {
                        final Drawable liziz = this.LIZIZ(s);
                        if (liziz != null) {
                            return liziz;
                        }
                        liz = this.LIZ(Uri.parse(s));
                        this.LIZ(s, liz);
                    }
                    catch (final Resources$NotFoundException ex2) {
                        return null;
                    }
                }
            }
        }
        return liz;
    }
    
    public static Object LIZ(Context context, String ex) {
        Label_0161: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0161;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)declaredField.get(systemService);
                            declaredField.set(systemService, new 2Lq((Handler)ex));
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return context;
                }
            }
            Label_0152: {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0152;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                }
                finally {
                    return context.getSystemService((String)ex);
                }
            }
        }
    }
    
    public static String LIZ(final Cursor cursor, final int n) {
        if (n == -1) {
            return null;
        }
        try {
            return cursor.getString(n);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static String LIZ(final Cursor cursor, final String s) {
        return LIZ(cursor, cursor.getColumnIndex(s));
    }
    
    private void LIZ(final ImageView imageView, final Drawable imageDrawable, final int visibility) {
        imageView.setImageDrawable(imageDrawable);
        if (imageDrawable == null) {
            imageView.setVisibility(visibility);
            return;
        }
        imageView.setVisibility(0);
        imageDrawable.setVisible(false, false);
        imageDrawable.setVisible(true, false);
    }
    
    private void LIZ(final TextView textView, final CharSequence text) {
        textView.setText(text);
        if (TextUtils.isEmpty(text)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
    }
    
    private void LIZ(final String s, final Drawable drawable) {
        if (drawable != null) {
            this.LJIILL.put(s, drawable.getConstantState());
        }
    }
    
    private Drawable LIZIZ(final Uri uri) {
        final String authority = uri.getAuthority();
        if (!TextUtils.isEmpty((CharSequence)authority)) {
            try {
                final Resources resourcesForApplication = super.LJ.getPackageManager().getResourcesForApplication(authority);
                final List pathSegments = uri.getPathSegments();
                if (pathSegments == null) {
                    throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
                }
                final int size = pathSegments.size();
                int n = 0;
                Label_0123: {
                    if (size == 1) {
                        try {
                            n = Integer.parseInt(pathSegments.get(0));
                            break Label_0123;
                        }
                        catch (final NumberFormatException ex) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                        }
                    }
                    if (size != 2) {
                        throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                    }
                    n = resourcesForApplication.getIdentifier((String)pathSegments.get(1), (String)pathSegments.get(0), authority);
                }
                if (n != 0) {
                    return resourcesForApplication.getDrawable(n);
                }
                throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
            }
            catch (final PackageManager$NameNotFoundException ex2) {
                throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
            }
        }
        throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
    }
    
    private Drawable LIZIZ(final String s) {
        final Drawable$ConstantState drawable$ConstantState = this.LJIILL.get(s);
        if (drawable$ConstantState == null) {
            return null;
        }
        return drawable$ConstantState.newDrawable();
    }
    
    private void LIZJ(final Cursor cursor) {
        if (cursor != null) {
            final Bundle extras = cursor.getExtras();
            if (extras != null) {
                extras.getBoolean("in_progress");
            }
        }
    }
    
    public final Cursor LIZ(final CharSequence charSequence) {
        Label_0292: {
            if (charSequence != null) {
                break Label_0292;
            }
            String string = "";
            while (true) {
                Label_0030: {
                    if (this.LJIIL.getVisibility() == 0 && this.LJIIL.getWindowVisibility() == 0) {
                        break Label_0030;
                    }
                    return null;
                    try {
                        final SearchableInfo ljiiliil = this.LJIILIIL;
                        Cursor query = null;
                        Label_0278: {
                            if (ljiiliil != null) {
                                final String suggestAuthority = ljiiliil.getSuggestAuthority();
                                if (suggestAuthority != null) {
                                    final Uri$Builder fragment = new Uri$Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                                    final String suggestPath = ljiiliil.getSuggestPath();
                                    if (suggestPath != null) {
                                        fragment.appendEncodedPath(suggestPath);
                                    }
                                    fragment.appendPath("search_suggest_query");
                                    final String suggestSelection = ljiiliil.getSuggestSelection();
                                    String[] array;
                                    if (suggestSelection != null) {
                                        array = new String[] { string };
                                    }
                                    else {
                                        fragment.appendPath(string);
                                        array = null;
                                    }
                                    fragment.appendQueryParameter("limit", "50");
                                    final Uri build = fragment.build();
                                    final ContentResolver contentResolver = super.LJ.getContentResolver();
                                    final 5an liz = new 5aq().LIZ(240004, "android/content/ContentResolver", "query", (Object)contentResolver, new Object[] { build, null, suggestSelection, array, null }, "android.database.Cursor", new 5dv(false));
                                    if (liz.LIZ) {
                                        query = (Cursor)liz.LIZIZ;
                                        break Label_0278;
                                    }
                                    query = contentResolver.query(build, (String[])null, suggestSelection, array, (String)null);
                                    break Label_0278;
                                }
                            }
                            query = null;
                        }
                        if (query != null) {
                            query.getCount();
                            return query;
                        }
                        return null;
                        string = charSequence.toString();
                        continue;
                    }
                    catch (final RuntimeException ex) {
                        return null;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public final View LIZ(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View liz = super.LIZ(context, cursor, viewGroup);
        liz.setTag((Object)new a(liz));
        ((ImageView)liz.findViewById(2131364694)).setImageResource(this.LJIILLIIL);
        return liz;
    }
    
    public final void LIZ(final Cursor cursor) {
        if (this.LJIIZILJ) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.LIZ(cursor);
            if (cursor != null) {
                this.LJIJI = cursor.getColumnIndex("suggest_text_1");
                this.LJIJJ = cursor.getColumnIndex("suggest_text_2");
                this.LJIJJLI = cursor.getColumnIndex("suggest_text_2_url");
                this.LJIL = cursor.getColumnIndex("suggest_icon_1");
                this.LJJ = cursor.getColumnIndex("suggest_icon_2");
                this.LJJI = cursor.getColumnIndex("suggest_flags");
            }
        }
        catch (final Exception ex) {}
    }
    
    public final void LIZ(final View view, final Cursor cursor) {
        final a a = (a)view.getTag();
        final int ljji = this.LJJI;
        int int1;
        if (ljji != -1) {
            int1 = cursor.getInt(ljji);
        }
        else {
            int1 = 0;
        }
        if (a.LIZ != null) {
            this.LIZ(a.LIZ, LIZ(cursor, this.LJIJI));
        }
        if (a.LIZIZ != null) {
            final String liz = LIZ(cursor, this.LJIJJLI);
            Object liz2;
            if (liz != null) {
                if (this.LJIJ == null) {
                    final TypedValue typedValue = new TypedValue();
                    super.LJ.getTheme().resolveAttribute(2130971216, typedValue, true);
                    this.LJIJ = super.LJ.getResources().getColorStateList(typedValue.resourceId);
                }
                liz2 = new SpannableString((CharSequence)liz);
                ((SpannableString)liz2).setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, this.LJIJ, (ColorStateList)null), 0, liz.length(), 33);
            }
            else {
                liz2 = LIZ(cursor, this.LJIJJ);
            }
            if (TextUtils.isEmpty((CharSequence)liz2)) {
                if (a.LIZ != null) {
                    a.LIZ.setSingleLine(false);
                    a.LIZ.setMaxLines(2);
                }
            }
            else if (a.LIZ != null) {
                a.LIZ.setSingleLine(true);
                a.LIZ.setMaxLines(1);
            }
            this.LIZ(a.LIZIZ, (CharSequence)liz2);
        }
        final ImageView lizj = a.LIZJ;
        final Drawable drawable = null;
        if (lizj != null) {
            final ImageView lizj2 = a.LIZJ;
            final int ljil = this.LJIL;
            Drawable drawable2 = null;
            Label_0236: {
                if (ljil == -1) {
                    drawable2 = null;
                }
                else {
                    drawable2 = this.LIZ(cursor.getString(ljil));
                    if (drawable2 == null) {
                        final ComponentName searchActivity = this.LJIILIIL.getSearchActivity();
                        final String flattenToShortString = searchActivity.flattenToShortString();
                        while (true) {
                            Label_0473: {
                                if (!this.LJIILL.containsKey(flattenToShortString)) {
                                    final Drawable liz3 = this.LIZ(searchActivity);
                                    Drawable$ConstantState constantState;
                                    if (liz3 == null) {
                                        constantState = null;
                                    }
                                    else {
                                        constantState = liz3.getConstantState();
                                    }
                                    this.LJIILL.put(flattenToShortString, constantState);
                                    drawable2 = liz3;
                                    break Label_0473;
                                }
                                final Drawable$ConstantState drawable$ConstantState = this.LJIILL.get(flattenToShortString);
                                if (drawable$ConstantState != null) {
                                    drawable2 = drawable$ConstantState.newDrawable(this.LJIILJJIL.getResources());
                                    break Label_0473;
                                }
                                drawable2 = super.LJ.getPackageManager().getDefaultActivityIcon();
                                break Label_0236;
                            }
                            if (drawable2 == null) {
                                continue;
                            }
                            break;
                        }
                    }
                }
            }
            this.LIZ(lizj2, drawable2, 4);
        }
        if (a.LIZLLL != null) {
            final ImageView lizlll = a.LIZLLL;
            final int ljj = this.LJJ;
            Drawable liz4;
            if (ljj == -1) {
                liz4 = drawable;
            }
            else {
                liz4 = this.LIZ(cursor.getString(ljj));
            }
            this.LIZ(lizlll, liz4, 8);
        }
        final int liz5 = this.LIZ;
        if (liz5 == 2 || (liz5 == 1 && (int1 & 0x1) != 0x0)) {
            a.LJ.setVisibility(0);
            a.LJ.setTag((Object)a.LIZ.getText());
            a.LJ.setOnClickListener((View$OnClickListener)this);
            return;
        }
        a.LJ.setVisibility(8);
    }
    
    public final CharSequence LIZIZ(final Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        final String liz = LIZ(cursor, "suggest_intent_query");
        if (liz != null) {
            return liz;
        }
        if (this.LJIILIIL.shouldRewriteQueryFromData()) {
            final String liz2 = LIZ(cursor, "suggest_intent_data");
            if (liz2 != null) {
                return liz2;
            }
        }
        if (this.LJIILIIL.shouldRewriteQueryFromText()) {
            final String liz3 = LIZ(cursor, "suggest_text_1");
            if (liz3 != null) {
                return liz3;
            }
        }
        return null;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        try {
            return super.getDropDownView(n, view, viewGroup);
        }
        catch (final RuntimeException ex) {
            final View liziz = this.LIZIZ(super.LJ, super.LIZLLL, viewGroup);
            if (liziz != null) {
                ((a)liziz.getTag()).LIZ.setText((CharSequence)ex.toString());
            }
            return liziz;
        }
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        try {
            return super.getView(n, view, viewGroup);
        }
        catch (final RuntimeException ex) {
            final View liz = this.LIZ(super.LJ, super.LIZLLL, viewGroup);
            if (liz != null) {
                ((a)liz.getTag()).LIZ.setText((CharSequence)ex.toString());
            }
            return liz;
        }
    }
    
    public final boolean hasStableIds() {
        return false;
    }
    
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.LIZJ(this.LIZ());
    }
    
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.LIZJ(this.LIZ());
    }
    
    public final void onClick(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.LJIIL.setQuery((CharSequence)tag);
        }
    }
    
    public static final class a
    {
        public final TextView LIZ;
        public final TextView LIZIZ;
        public final ImageView LIZJ;
        public final ImageView LIZLLL;
        public final ImageView LJ;
        
        static {
            Covode.recordClassIndex(495);
        }
        
        public a(final View view) {
            this.LIZ = (TextView)view.findViewById(16908308);
            this.LIZIZ = (TextView)view.findViewById(16908309);
            this.LIZJ = (ImageView)view.findViewById(16908295);
            this.LIZLLL = (ImageView)view.findViewById(16908296);
            this.LJ = (ImageView)view.findViewById(2131364694);
        }
    }
}
