// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Log;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.DragEvent;
import d4.b;
import m3.c;
import a4.p0;
import ng.f0;
import d4.a;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.os.Build$VERSION;
import android.text.Editable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ActionMode$Callback;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import a4.h0;
import android.widget.EditText;

public class j extends EditText implements h0
{
    private final k mAppCompatEmojiEditTextHelper;
    private final e mBackgroundTintHelper;
    private final e4.k mDefaultOnReceiveContentListener;
    private a mSuperCaller;
    private final v mTextClassifierHelper;
    private final w mTextHelper;
    
    public j(final Context context) {
        this(context, null);
    }
    
    public j(final Context context, final AttributeSet set) {
        this(context, set, 2130968940);
    }
    
    public j(final Context context, final AttributeSet set, final int n) {
        w0.a(context);
        super(context, set, n);
        u0.a(((View)this).getContext(), (View)this);
        (this.mBackgroundTintHelper = new e((View)this)).d(set, n);
        final w mTextHelper = new w((TextView)this);
        (this.mTextHelper = mTextHelper).f(set, n);
        mTextHelper.b();
        this.mTextClassifierHelper = new v((TextView)this);
        this.mDefaultOnReceiveContentListener = new e4.k();
        final k mAppCompatEmojiEditTextHelper = new k(this);
        (this.mAppCompatEmojiEditTextHelper = mAppCompatEmojiEditTextHelper).b(set, n);
        this.initEmojiKeyListener(mAppCompatEmojiEditTextHelper);
    }
    
    public static /* synthetic */ TextClassifier access$001(final j j) {
        return j.getTextClassifier();
    }
    
    public static /* synthetic */ void access$101(final j j, final TextClassifier textClassifier) {
        j.setTextClassifier(textClassifier);
    }
    
    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.a();
        }
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return e4.j.e(super.getCustomSelectionActionModeCallback());
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        ColorStateList b;
        if (mBackgroundTintHelper != null) {
            b = mBackgroundTintHelper.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        PorterDuff$Mode c;
        if (mBackgroundTintHelper != null) {
            c = mBackgroundTintHelper.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }
    
    public Editable getText() {
        if (Build$VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
    
    public TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final v mTextClassifierHelper = this.mTextClassifierHelper;
            if (mTextClassifierHelper != null) {
                TextClassifier textClassifier;
                if ((textClassifier = mTextClassifierHelper.b) == null) {
                    textClassifier = v$a.a(mTextClassifierHelper.a);
                }
                return textClassifier;
            }
        }
        return access$001(this.getSuperCaller().a);
    }
    
    public void initEmojiKeyListener(final k k) {
        final KeyListener keyListener = ((TextView)this).getKeyListener();
        k.getClass();
        if (keyListener instanceof NumberKeyListener ^ true) {
            final boolean focusable = super.isFocusable();
            final boolean clickable = super.isClickable();
            final boolean longClickable = super.isLongClickable();
            final int inputType = super.getInputType();
            final KeyListener a = k.a(keyListener);
            if (a == keyListener) {
                return;
            }
            super.setKeyListener(a);
            super.setRawInputType(inputType);
            super.setFocusable(focusable);
            super.setClickable(clickable);
            super.setLongClickable(longClickable);
        }
    }
    
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.b.a.b.i;
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 30 && onCreateInputConnection != null) {
            d4.a.c(editorInfo, this.getText());
        }
        f0.o2((View)this, editorInfo, onCreateInputConnection);
        Object o;
        if ((o = onCreateInputConnection) != null) {
            o = onCreateInputConnection;
            if (sdk_INT <= 30) {
                final String[] e = p0.e((View)this);
                o = onCreateInputConnection;
                if (e != null) {
                    d4.a.b(editorInfo, e);
                    final c c = new c(this, 1);
                    if (sdk_INT >= 25) {
                        o = new b(onCreateInputConnection, c);
                    }
                    else if (d4.a.a(editorInfo).length == 0) {
                        o = onCreateInputConnection;
                    }
                    else {
                        o = new d4.c(onCreateInputConnection, c);
                    }
                }
            }
        }
        return this.mAppCompatEmojiEditTextHelper.c((InputConnection)o, editorInfo);
    }
    
    public boolean onDragEvent(final DragEvent dragEvent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int a;
        final int n = a = 0;
        if (sdk_INT < 31) {
            a = n;
            if (dragEvent.getLocalState() == null) {
                if (p0.e((View)this) != null) {
                    Context context = ((View)this).getContext();
                    while (true) {
                        while (context instanceof ContextWrapper) {
                            if (context instanceof Activity) {
                                final Activity activity = (Activity)context;
                                if (activity == null) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Can't handle drop: no activity: view=");
                                    sb.append(this);
                                    Log.i("ReceiveContent", sb.toString());
                                    a = n;
                                    return a != 0 || super.onDragEvent(dragEvent);
                                }
                                if (dragEvent.getAction() == 1) {
                                    a = n;
                                    return a != 0 || super.onDragEvent(dragEvent);
                                }
                                a = n;
                                if (dragEvent.getAction() == 3) {
                                    a = (s.a(dragEvent, (TextView)this, activity) ? 1 : 0);
                                    return a != 0 || super.onDragEvent(dragEvent);
                                }
                                return a != 0 || super.onDragEvent(dragEvent);
                            }
                            else {
                                context = ((ContextWrapper)context).getBaseContext();
                            }
                        }
                        final Activity activity = null;
                        continue;
                    }
                }
                a = n;
            }
        }
        return a != 0 || super.onDragEvent(dragEvent);
    }
    
    public a4.c onReceiveContent(final a4.c c) {
        return this.mDefaultOnReceiveContentListener.a((View)this, c);
    }
    
    public boolean onTextContextMenuItem(final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n2 = 0;
        final int n3 = 0;
        int n4 = n2;
        if (sdk_INT < 31) {
            n4 = n2;
            if (p0.e((View)this) != null) {
                if (n != 16908322 && n != 16908337) {
                    n4 = n2;
                }
                else {
                    final ClipboardManager clipboardManager = (ClipboardManager)((View)this).getContext().getSystemService("clipboard");
                    ClipData primaryClip;
                    if (clipboardManager == null) {
                        primaryClip = null;
                    }
                    else {
                        primaryClip = clipboardManager.getPrimaryClip();
                    }
                    if (primaryClip != null && primaryClip.getItemCount() > 0) {
                        final a4.c.a a = new a4.c.a(primaryClip, 1);
                        int flags;
                        if (n == 16908322) {
                            flags = n3;
                        }
                        else {
                            flags = 1;
                        }
                        a.a.setFlags(flags);
                        p0.h((View)this, a.a.build());
                    }
                    n4 = 1;
                }
            }
        }
        return n4 != 0 || super.onTextContextMenuItem(n);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.f(backgroundResource);
        }
    }
    
    public void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(e4.j.f(actionMode$Callback, (TextView)this));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.mAppCompatEmojiEditTextHelper.d(b);
    }
    
    public void setKeyListener(final KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.mTextHelper.k(list);
        this.mTextHelper.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.mTextHelper.l(porterDuff$Mode);
        this.mTextHelper.b();
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.g(n, context);
        }
    }
    
    public void setTextClassifier(final TextClassifier b) {
        if (Build$VERSION.SDK_INT < 28) {
            final v mTextClassifierHelper = this.mTextClassifierHelper;
            if (mTextClassifierHelper != null) {
                mTextClassifierHelper.b = b;
                return;
            }
        }
        access$101(this.getSuperCaller().a, b);
    }
    
    public final class a
    {
        public final /* synthetic */ j a;
    }
}
