// 
// Decompiled by Procyon v0.6.0
// 

package e4;

import android.content.pm.ActivityInfo;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.text.Editable;
import android.content.Intent;
import android.app.Activity;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ActionMode;
import java.lang.reflect.Method;
import a4.z0;
import a4.x0;
import android.text.PrecomputedText$Params;
import a4.y0;
import android.icu.text.DecimalFormatSymbols;
import android.graphics.PorterDuff$Mode;
import java.util.Locale;
import android.graphics.drawable.Drawable;
import android.view.ActionMode$Callback;
import android.graphics.Paint$FontMetricsInt;
import ej2.c0;
import android.content.res.ColorStateList;
import android.text.TextDirectionHeuristic;
import android.view.View;
import android.text.TextDirectionHeuristics;
import android.text.method.PasswordTransformationMethod;
import y3.d$a$a;
import android.graphics.Paint;
import android.text.TextPaint;
import android.os.Build$VERSION;
import y3.d$a;
import android.widget.TextView;

public final class j
{
    public static d$a a(final TextView textView) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return new d$a(e.b(textView));
        }
        final TextPaint textPaint = new TextPaint((Paint)textView.getPaint());
        final d$a$a d$a$a = new d$a$a(textPaint);
        d$a$a.a = c.a(textView);
        d$a$a.b = c.d(textView);
        TextDirectionHeuristic textDirectionHeuristic = null;
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        else {
            boolean b = false;
            if (sdk_INT >= 28 && (textView.getInputType() & 0xF) == 0x3) {
                final byte directionality = Character.getDirectionality(e.a(d.a(j.b.d(textView)))[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            }
            else {
                if (j.b.b((View)textView) == 1) {
                    b = true;
                }
                switch (j.b.c((View)textView)) {
                    default: {
                        if (b) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    }
                    case 7: {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    case 6: {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    }
                    case 5: {
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    }
                    case 4: {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    }
                    case 3: {
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    }
                    case 2: {
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    }
                }
            }
        }
        return new d$a(textPaint, textDirectionHeuristic, d$a$a.a, d$a$a.b);
    }
    
    public static void b(final TextView textView, final ColorStateList list) {
        textView.getClass();
        c.f(textView, list);
    }
    
    public static void c(final TextView textView, final int n) {
        c0.F2(n);
        if (Build$VERSION.SDK_INT >= 28) {
            e.c(textView, n);
            return;
        }
        final Paint$FontMetricsInt fontMetricsInt = ((Paint)textView.getPaint()).getFontMetricsInt();
        int n2;
        if (a.a(textView)) {
            n2 = fontMetricsInt.top;
        }
        else {
            n2 = fontMetricsInt.ascent;
        }
        if (n > Math.abs(n2)) {
            textView.setPadding(((View)textView).getPaddingLeft(), n + n2, ((View)textView).getPaddingRight(), ((View)textView).getPaddingBottom());
        }
    }
    
    public static void d(final TextView textView, final int n) {
        c0.F2(n);
        final Paint$FontMetricsInt fontMetricsInt = ((Paint)textView.getPaint()).getFontMetricsInt();
        int n2;
        if (a.a(textView)) {
            n2 = fontMetricsInt.bottom;
        }
        else {
            n2 = fontMetricsInt.descent;
        }
        if (n > Math.abs(n2)) {
            textView.setPadding(((View)textView).getPaddingLeft(), ((View)textView).getPaddingTop(), ((View)textView).getPaddingRight(), n - n2);
        }
    }
    
    public static ActionMode$Callback e(final ActionMode$Callback actionMode$Callback) {
        ActionMode$Callback a = actionMode$Callback;
        if (actionMode$Callback instanceof f) {
            a = actionMode$Callback;
            if (Build$VERSION.SDK_INT >= 26) {
                a = ((f)actionMode$Callback).a;
            }
        }
        return a;
    }
    
    public static ActionMode$Callback f(final ActionMode$Callback actionMode$Callback, final TextView textView) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26 && sdk_INT <= 27 && !(actionMode$Callback instanceof f) && actionMode$Callback != null) {
            return (ActionMode$Callback)new f(actionMode$Callback, textView);
        }
        return actionMode$Callback;
    }
    
    public static final class a
    {
        public static boolean a(final TextView textView) {
            return textView.getIncludeFontPadding();
        }
        
        public static int b(final TextView textView) {
            return textView.getMaxLines();
        }
        
        public static int c(final TextView textView) {
            return textView.getMinLines();
        }
    }
    
    public static final class b
    {
        public static Drawable[] a(final TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
        
        public static int b(final View view) {
            return view.getLayoutDirection();
        }
        
        public static int c(final View view) {
            return view.getTextDirection();
        }
        
        public static Locale d(final TextView textView) {
            return textView.getTextLocale();
        }
        
        public static void e(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }
        
        public static void f(final TextView textView, final int n, final int n2, final int n3, final int n4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(n, n2, n3, n4);
        }
        
        public static void g(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
        
        public static void h(final View view, final int textDirection) {
            view.setTextDirection(textDirection);
        }
    }
    
    public static final class c
    {
        public static int a(final TextView textView) {
            return textView.getBreakStrategy();
        }
        
        public static ColorStateList b(final TextView textView) {
            return textView.getCompoundDrawableTintList();
        }
        
        public static PorterDuff$Mode c(final TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }
        
        public static int d(final TextView textView) {
            return textView.getHyphenationFrequency();
        }
        
        public static void e(final TextView textView, final int breakStrategy) {
            textView.setBreakStrategy(breakStrategy);
        }
        
        public static void f(final TextView textView, final ColorStateList compoundDrawableTintList) {
            textView.setCompoundDrawableTintList(compoundDrawableTintList);
        }
        
        public static void g(final TextView textView, final PorterDuff$Mode compoundDrawableTintMode) {
            textView.setCompoundDrawableTintMode(compoundDrawableTintMode);
        }
        
        public static void h(final TextView textView, final int hyphenationFrequency) {
            textView.setHyphenationFrequency(hyphenationFrequency);
        }
    }
    
    public static final class d
    {
        public static DecimalFormatSymbols a(final Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }
    
    public static final class e
    {
        public static String[] a(final DecimalFormatSymbols decimalFormatSymbols) {
            return y0.j(decimalFormatSymbols);
        }
        
        public static PrecomputedText$Params b(final TextView textView) {
            return x0.b(textView);
        }
        
        public static void c(final TextView textView, final int n) {
            z0.e(textView, n);
        }
    }
    
    public static final class f implements ActionMode$Callback
    {
        public final ActionMode$Callback a;
        public final TextView b;
        public Class<?> c;
        public Method d;
        public boolean e;
        public boolean f;
        
        public f(final ActionMode$Callback a, final TextView b) {
            this.a = a;
            this.b = b;
            this.f = false;
        }
        
        public final boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }
        
        public final boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }
        
        public final void onDestroyActionMode(final ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }
        
        public final boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
            final Context context = ((View)this.b).getContext();
            final PackageManager packageManager = context.getPackageManager();
            if (!this.f) {
                this.f = true;
                try {
                    final Class<?> forName = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.c = forName;
                    this.d = forName.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.e = true;
                }
                catch (final ClassNotFoundException | NoSuchMethodException ex) {
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                Method method;
                if (this.e && this.c.isInstance(menu)) {
                    method = this.d;
                }
                else {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                int i = menu.size();
                --i;
                while (i >= 0) {
                    final MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, i);
                    }
                    --i;
                }
                final ArrayList<ResolveInfo> list = new ArrayList<ResolveInfo>();
                if (context instanceof Activity) {
                    for (final ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        boolean b = false;
                        Label_0355: {
                            Label_0352: {
                                if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                                    final ActivityInfo activityInfo = resolveInfo.activityInfo;
                                    if (activityInfo.exported) {
                                        final String permission = activityInfo.permission;
                                        if (permission == null) {
                                            break Label_0352;
                                        }
                                        if (context.checkSelfPermission(permission) == 0) {
                                            break Label_0352;
                                        }
                                    }
                                    b = false;
                                    break Label_0355;
                                }
                            }
                            b = true;
                        }
                        if (b) {
                            list.add(resolveInfo);
                        }
                    }
                }
                for (int j = 0; j < list.size(); ++j) {
                    final ResolveInfo resolveInfo2 = list.get(j);
                    final MenuItem add = menu.add(0, 0, j + 100, resolveInfo2.loadLabel(packageManager));
                    final TextView b2 = this.b;
                    final Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", (b2 instanceof Editable && b2.onCheckIsTextEditor() && ((View)b2).isEnabled()) ^ true);
                    final ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
                return this.a.onPrepareActionMode(actionMode, menu);
            }
            catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex2) {
                return this.a.onPrepareActionMode(actionMode, menu);
            }
        }
    }
}
