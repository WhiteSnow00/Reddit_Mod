// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.text.Editable;
import android.content.pm.ResolveInfo;
import java.util.List;
import android.app.Activity;
import java.util.ArrayList;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ActionMode;
import android.content.Intent;
import java.lang.reflect.Method;
import android.icu.text.DecimalFormatSymbols;
import android.text.TextDirectionHeuristics;
import android.text.method.PasswordTransformationMethod;
import android.text.TextDirectionHeuristic;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import android.text.TextPaint;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.view.ActionMode$Callback;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class 08p
{
    static {
        Covode.recordClassIndex(926);
    }
    
    public static ActionMode$Callback LIZ(final TextView textView, final ActionMode$Callback actionMode$Callback) {
        if (Build$VERSION.SDK_INT < 26 || Build$VERSION.SDK_INT > 27 || actionMode$Callback instanceof a) {
            return actionMode$Callback;
        }
        return (ActionMode$Callback)new a(actionMode$Callback, textView);
    }
    
    public static void LIZ(final TextView textView) {
        if (Build$VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(0);
            return;
        }
        if (textView instanceof 08i) {
            ((08i)textView).setAutoSizeTextTypeWithDefaults(0);
        }
    }
    
    public static void LIZ(final TextView textView, final int textAppearance) {
        if (Build$VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(textAppearance);
            return;
        }
        textView.setTextAppearance(textView.getContext(), textAppearance);
    }
    
    public static void LIZ(final TextView textView, final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
            return;
        }
        if (textView instanceof 08i) {
            ((08i)textView).setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
        }
    }
    
    public static void LIZ(final TextView textView, final 07K text) {
        if (Build$VERSION.SDK_INT >= 29) {
            textView.setText((CharSequence)text.LIZ());
            return;
        }
        if (LIZIZ(textView).LIZ(text.LIZ)) {
            textView.setText((CharSequence)text);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }
    
    public static void LIZ(final TextView textView, final ColorStateList list) {
        07U.LIZ(textView);
        if (Build$VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(list);
            return;
        }
        if (textView instanceof 08q) {
            ((08q)textView).setSupportCompoundDrawablesTintList(list);
        }
    }
    
    public static void LIZ(final TextView textView, final PorterDuff$Mode porterDuff$Mode) {
        07U.LIZ(textView);
        if (Build$VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(porterDuff$Mode);
            return;
        }
        if (textView instanceof 08q) {
            ((08q)textView).setSupportCompoundDrawablesTintMode(porterDuff$Mode);
        }
    }
    
    public static void LIZ(final TextView textView, final Drawable drawable) {
        textView.setCompoundDrawablesRelative(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
    }
    
    public static 07K.a LIZIZ(final TextView textView) {
        if (Build$VERSION.SDK_INT >= 28) {
            return new 07K.a(textView.getTextMetricsParams());
        }
        final 07K.a.a a = new 07K.a.a(new TextPaint((Paint)textView.getPaint()));
        if (Build$VERSION.SDK_INT >= 23) {
            a.LIZIZ = textView.getBreakStrategy();
            a.LIZJ = textView.getHyphenationFrequency();
        }
        a.LIZ = LIZJ(textView);
        return a.LIZ();
    }
    
    public static void LIZIZ(final TextView textView, final int firstBaselineToTopHeight) {
        07U.LIZ(firstBaselineToTopHeight);
        if (Build$VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
            return;
        }
        final Paint$FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n;
        if (textView.getIncludeFontPadding()) {
            n = fontMetricsInt.top;
        }
        else {
            n = fontMetricsInt.ascent;
        }
        if (firstBaselineToTopHeight > Math.abs(n)) {
            textView.setPadding(textView.getPaddingLeft(), firstBaselineToTopHeight + n, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }
    
    public static TextDirectionHeuristic LIZJ(final TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT >= 28 && (textView.getInputType() & 0xF) == 0x3) {
            final byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
        else {
            if (textView.getLayoutDirection() == 1) {
                b = true;
            }
            switch (textView.getTextDirection()) {
                default: {
                    if (b) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                }
                case 2: {
                    return TextDirectionHeuristics.ANYRTL_LTR;
                }
                case 3: {
                    return TextDirectionHeuristics.LTR;
                }
                case 4: {
                    return TextDirectionHeuristics.RTL;
                }
                case 5: {
                    return TextDirectionHeuristics.LOCALE;
                }
                case 6: {
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                }
                case 7: {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
            }
        }
    }
    
    public static void LIZJ(final TextView textView, final int n) {
        07U.LIZ(n);
        final Paint$FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n2;
        if (textView.getIncludeFontPadding()) {
            n2 = fontMetricsInt.bottom;
        }
        else {
            n2 = fontMetricsInt.descent;
        }
        if (n > Math.abs(n2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), n - n2);
        }
    }
    
    public static void LIZLLL(final TextView textView, final int n) {
        07U.LIZ(n);
        final int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint$FontMetricsInt)null);
        if (n != fontMetricsInt) {
            textView.setLineSpacing((float)(n - fontMetricsInt), 1.0f);
        }
    }
    
    public static final class a implements ActionMode$Callback
    {
        public final ActionMode$Callback LIZ;
        public final TextView LIZIZ;
        public Class<?> LIZJ;
        public Method LIZLLL;
        public boolean LJ;
        public boolean LJFF;
        
        static {
            Covode.recordClassIndex(927);
        }
        
        public a(final ActionMode$Callback liz, final TextView liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        private Intent LIZ() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
        
        public final boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
            return this.LIZ.onActionItemClicked(actionMode, menuItem);
        }
        
        public final boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
            return this.LIZ.onCreateActionMode(actionMode, menu);
        }
        
        public final void onDestroyActionMode(final ActionMode actionMode) {
            this.LIZ.onDestroyActionMode(actionMode);
        }
        
        public final boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
            final Context context = this.LIZIZ.getContext();
            final PackageManager packageManager = context.getPackageManager();
            if (!this.LJFF) {
                this.LJFF = true;
                try {
                    final Class<?> forName = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.LIZJ = forName;
                    this.LIZLLL = forName.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.LJ = true;
                }
                catch (final ClassNotFoundException | NoSuchMethodException ex) {
                    this.LIZJ = null;
                    this.LIZLLL = null;
                    this.LJ = false;
                }
            }
            try {
                Method method;
                if (this.LJ && this.LIZJ.isInstance(menu)) {
                    method = this.LIZLLL;
                }
                else {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int i = menu.size() - 1; i >= 0; --i) {
                    final MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, i);
                    }
                }
                final ArrayList list = new ArrayList();
                if (context instanceof Activity) {
                    final Intent liz = this.LIZ();
                    final 5an liz2 = new 5aq().LIZ(101311, "android/content/pm/PackageManager", "queryIntentActivities", (Object)packageManager, new Object[] { liz, 0 }, "java.util.List", new 5dv(false));
                    List queryIntentActivities;
                    if (liz2.LIZ) {
                        queryIntentActivities = (List)liz2.LIZIZ;
                    }
                    else {
                        queryIntentActivities = packageManager.queryIntentActivities(liz, 0);
                    }
                    for (final ResolveInfo resolveInfo : queryIntentActivities) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            if (!resolveInfo.activityInfo.exported) {
                                continue;
                            }
                            if (resolveInfo.activityInfo.permission != null) {
                                if (context.checkSelfPermission(resolveInfo.activityInfo.permission) != 0) {
                                    continue;
                                }
                            }
                        }
                        list.add(resolveInfo);
                    }
                }
                for (int j = 0; j < list.size(); ++j) {
                    final ResolveInfo resolveInfo2 = (ResolveInfo)list.get(j);
                    final MenuItem add = menu.add(0, 0, j + 100, resolveInfo2.loadLabel(packageManager));
                    final TextView liziz = this.LIZIZ;
                    final Intent liz3 = this.LIZ();
                    boolean b;
                    if (liziz instanceof Editable && liziz.onCheckIsTextEditor() && liziz.isEnabled()) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    add.setIntent(liz3.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", b ^ true).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
                }
                return this.LIZ.onPrepareActionMode(actionMode, menu);
            }
            catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex2) {
                return this.LIZ.onPrepareActionMode(actionMode, menu);
            }
        }
    }
}
