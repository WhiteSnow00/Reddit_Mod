// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.method.KeyListener;
import android.widget.TextView;
import android.view.ActionMode$Callback;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.inputmethodservice.ExtractEditText;

public class 09a extends ExtractEditText
{
    public 09e LIZ;
    public boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(1003);
    }
    
    public 09a(final Context context, final AttributeSet set) {
        super(context, set);
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            this.setMaxEmojiCount(new 09c((View)this, set).LIZ);
            this.setKeyListener(super.getKeyListener());
        }
    }
    
    private 09e getEmojiEditTextHelper() {
        if (this.LIZ == null) {
            this.LIZ = new 09e((EditText)this);
        }
        return this.LIZ;
    }
    
    public int getEmojiReplaceStrategy() {
        return this.getEmojiEditTextHelper().LIZJ;
    }
    
    public int getMaxEmojiCount() {
        return this.getEmojiEditTextHelper().LIZIZ;
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        return this.getEmojiEditTextHelper().LIZ(super.onCreateInputConnection(editorInfo), editorInfo);
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(08p.LIZ((TextView)this, actionMode$Callback));
    }
    
    public void setEmojiReplaceStrategy(final int lizj) {
        final 09e emojiEditTextHelper = this.getEmojiEditTextHelper();
        emojiEditTextHelper.LIZJ = lizj;
        emojiEditTextHelper.LIZ.LIZIZ(lizj);
    }
    
    public void setKeyListener(final KeyListener keyListener) {
        KeyListener liz = keyListener;
        if (keyListener != null) {
            liz = this.getEmojiEditTextHelper().LIZ(keyListener);
        }
        super.setKeyListener(liz);
    }
    
    public void setMaxEmojiCount(final int n) {
        this.getEmojiEditTextHelper().LIZ(n);
    }
}
