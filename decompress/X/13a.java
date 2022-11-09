// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ActionMode$Callback;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.app.Activity;
import android.view.ViewParent;
import android.util.Log;
import android.view.ViewGroup;
import org.json.JSONObject;
import android.widget.TextView;
import android.view.View;
import androidx.appcompat.widget.an;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.widget.u;
import android.widget.Button;

public class 13a extends Button implements 08i
{
    public final 04J LIZ;
    public final u LIZIZ;
    
    static {
        Covode.recordClassIndex(522);
    }
    
    public 13a(final Context context, final AttributeSet set) {
        this(context, set, 2130969191);
    }
    
    public 13a(final Context context, final AttributeSet set, final int n) {
        an.LIZ(context);
        super(context, set, n);
        (this.LIZ = new 04J((View)this)).LIZ(set, n);
        final u liziz = new u((TextView)this);
        (this.LIZIZ = liziz).LIZ(set, n);
        liziz.LIZ();
    }
    
    public void drawableStateChanged() {
        try {
            super.drawableStateChanged();
            final 04J liz = this.LIZ;
            if (liz != null) {
                liz.LIZLLL();
            }
            final u liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.LIZ();
            }
        }
        catch (final Exception ex) {
            try {
                4ch.LIZ((Throwable)ex);
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("targetViewId", ((View)this).getId());
                jsonObject.put("targetViewClassName", (Object)this.getClass().getName());
                final ViewParent parent = ((View)this).getParent();
                if (parent instanceof ViewGroup) {
                    jsonObject.put("targetParentViewId", ((ViewGroup)parent).getId());
                    jsonObject.put("targetParentViewClassName", (Object)((ViewGroup)parent).getClass().getName());
                }
                final Activity ljiiiz = NR7.LJIJ.LJIIIZ();
                String name;
                if (ljiiiz != null) {
                    name = ljiiiz.getClass().getName();
                }
                else {
                    name = "";
                }
                jsonObject.put("currentActivity", (Object)name);
                jsonObject.put("errorMsg", (Object)Log.getStackTraceString((Throwable)ex));
                6ZX.LIZ("detail_view_animation_crash", (JSONObject)null, (JSONObject)null, jsonObject);
            }
            finally {}
        }
    }
    
    public int getAutoSizeMaxTextSize() {
        if (08i.LIZLLL) {
            return super.getAutoSizeMaxTextSize();
        }
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            return Math.round(liziz.LIZJ.LIZLLL);
        }
        return -1;
    }
    
    public int getAutoSizeMinTextSize() {
        if (08i.LIZLLL) {
            return super.getAutoSizeMinTextSize();
        }
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            return Math.round(liziz.LIZJ.LIZJ);
        }
        return -1;
    }
    
    public int getAutoSizeStepGranularity() {
        if (08i.LIZLLL) {
            return super.getAutoSizeStepGranularity();
        }
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            return Math.round(liziz.LIZJ.LIZIZ);
        }
        return -1;
    }
    
    public int[] getAutoSizeTextAvailableSizes() {
        if (08i.LIZLLL) {
            return super.getAutoSizeTextAvailableSizes();
        }
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.LIZJ.LJ;
        }
        return new int[0];
    }
    
    public int getAutoSizeTextType() {
        if (08i.LIZLLL) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        else {
            final u liziz = this.LIZIZ;
            if (liziz != null) {
                return liziz.LIZJ.LIZ;
            }
            return 0;
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final 04J liz = this.LIZ;
        if (liz != null) {
            return liz.LIZIZ();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final 04J liz = this.LIZ;
        if (liz != null) {
            return liz.LIZJ();
        }
        return null;
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)Button.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZIZ();
        }
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        if (this.LIZIZ != null && !08i.LIZLLL && this.LIZIZ.LIZJ.LIZIZ()) {
            this.LIZIZ.LIZJ.LIZ();
        }
    }
    
    public void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) {
        if (08i.LIZLLL) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
            return;
        }
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(n, n2, n3, n4);
        }
    }
    
    public void setAutoSizeTextTypeUniformWithPresetSizes(final int[] array, final int n) {
        if (08i.LIZLLL) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
            return;
        }
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(array, n);
        }
    }
    
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextTypeWithDefaults) {
        if (08i.LIZLLL) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
            return;
        }
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(autoSizeTextTypeWithDefaults);
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final 04J liz = this.LIZ;
        if (liz != null) {
            liz.LIZ();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final 04J liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(backgroundResource);
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(08p.LIZ((TextView)this, actionMode$Callback));
    }
    
    public void setSupportAllCaps(final boolean b) {
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(b);
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final 04J liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final 04J liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(porterDuff$Mode);
        }
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(context, n);
        }
    }
    
    public void setTextSize(final int n, final float n2) {
        if (08i.LIZLLL) {
            super.setTextSize(n, n2);
            return;
        }
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(n, n2);
        }
    }
}
