// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji.widget;

import mj2.c0;
import n4.e;
import android.text.method.KeyListener;
import android.widget.TextView;
import e4.j;
import android.view.ActionMode$Callback;
import n4.c;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import n4.a;
import android.inputmethodservice.ExtractEditText;

public class EmojiExtractEditText extends ExtractEditText
{
    public a f;
    public boolean g;
    
    public EmojiExtractEditText(final Context context, final AttributeSet set) {
        super(context, set);
        if (!this.g) {
            this.g = true;
            this.setMaxEmojiCount(new lc.a((View)this, set).f);
            this.setKeyListener(super.getKeyListener());
        }
    }
    
    private a getEmojiEditTextHelper() {
        if (this.f == null) {
            this.f = new a((EditText)this);
        }
        return this.f;
    }
    
    public int getEmojiReplaceStrategy() {
        return this.getEmojiEditTextHelper().c;
    }
    
    public int getMaxEmojiCount() {
        return this.getEmojiEditTextHelper().b;
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        final a emojiEditTextHelper = this.getEmojiEditTextHelper();
        Object o;
        if (onCreateInputConnection == null) {
            emojiEditTextHelper.getClass();
            o = null;
        }
        else {
            final a.a a = emojiEditTextHelper.a;
            a.getClass();
            if (onCreateInputConnection instanceof c) {
                o = onCreateInputConnection;
            }
            else {
                o = new c(a.a, onCreateInputConnection, editorInfo);
            }
        }
        return (InputConnection)o;
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(j.f(actionMode$Callback, (TextView)this));
    }
    
    public void setEmojiReplaceStrategy(final int n) {
        final a emojiEditTextHelper = this.getEmojiEditTextHelper();
        emojiEditTextHelper.c = n;
        emojiEditTextHelper.a.b.i = n;
    }
    
    public void setKeyListener(final KeyListener keyListener) {
        Object keyListener2 = keyListener;
        if (keyListener != null) {
            final a emojiEditTextHelper = this.getEmojiEditTextHelper();
            emojiEditTextHelper.getClass();
            emojiEditTextHelper.a.getClass();
            if (keyListener instanceof e) {
                keyListener2 = keyListener;
            }
            else {
                keyListener2 = new e(keyListener);
            }
        }
        super.setKeyListener((KeyListener)keyListener2);
    }
    
    public void setMaxEmojiCount(final int n) {
        final a emojiEditTextHelper = this.getEmojiEditTextHelper();
        emojiEditTextHelper.getClass();
        c0.r(n, "maxEmojiCount should be greater than 0");
        emojiEditTextHelper.b = n;
        emojiEditTextHelper.a.b.h = n;
    }
}
