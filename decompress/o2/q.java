// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import android.util.Log;
import android.os.Handler;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.text.TextUtils;
import i2.o;
import android.view.inputmethod.CorrectionInfo;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.CompletionInfo;
import android.view.KeyEvent;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import sg2.e;
import java.util.ArrayList;
import androidx.compose.ui.text.input.TextFieldValue;
import android.view.inputmethod.InputConnection;

public final class q implements InputConnection
{
    public final k a;
    public final boolean b;
    public int c;
    public TextFieldValue d;
    public int e;
    public boolean f;
    public final ArrayList g;
    public boolean h;
    
    public q(final TextFieldValue d, final v a, final boolean b) {
        sg2.e.f((Object)d, "initState");
        this.a = a;
        this.b = b;
        this.d = d;
        this.g = new ArrayList();
        this.h = true;
    }
    
    public final void a(final d d) {
        ++this.c;
        try {
            this.g.add(d);
        }
        finally {
            this.b();
        }
    }
    
    public final boolean b() {
        final int c = this.c - 1;
        this.c = c;
        boolean b = true;
        if (c == 0 && (this.g.isEmpty() ^ true)) {
            this.a.b(CollectionsKt___CollectionsKt.r4((Collection)this.g));
            this.g.clear();
        }
        if (this.c <= 0) {
            b = false;
        }
        return b;
    }
    
    public final boolean beginBatchEdit() {
        boolean h;
        if (h = this.h) {
            ++this.c;
            h = true;
        }
        return h;
    }
    
    public final void c(final int n) {
        this.sendKeyEvent(new KeyEvent(0, n));
        this.sendKeyEvent(new KeyEvent(1, n));
    }
    
    public final boolean clearMetaKeyStates(final int n) {
        boolean h;
        if (h = this.h) {
            h = false;
        }
        return h;
    }
    
    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
    }
    
    public final boolean commitCompletion(final CompletionInfo completionInfo) {
        boolean h;
        if (h = this.h) {
            h = false;
        }
        return h;
    }
    
    public final boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
        sg2.e.f((Object)inputContentInfo, "inputContentInfo");
        boolean h;
        if (h = this.h) {
            h = false;
        }
        return h;
    }
    
    public final boolean commitCorrection(final CorrectionInfo correctionInfo) {
        boolean b;
        if (b = this.h) {
            b = this.b;
        }
        return b;
    }
    
    public final boolean commitText(final CharSequence charSequence, final int n) {
        final boolean h = this.h;
        if (h) {
            this.a(new a(String.valueOf(charSequence), n));
        }
        return h;
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        final boolean h = this.h;
        if (h) {
            this.a(new b(n, n2));
            return true;
        }
        return h;
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        final boolean h = this.h;
        if (h) {
            this.a(new c(n, n2));
            return true;
        }
        return h;
    }
    
    public final boolean endBatchEdit() {
        return this.b();
    }
    
    public final boolean finishComposingText() {
        boolean h;
        if (h = this.h) {
            this.a(new g());
            h = true;
        }
        return h;
    }
    
    public final int getCursorCapsMode(final int n) {
        final TextFieldValue d = this.d;
        return TextUtils.getCapsMode((CharSequence)d.a.f, o.f(d.b), n);
    }
    
    public final ExtractedText getExtractedText(final ExtractedTextRequest extractedTextRequest, int token) {
        boolean f = true;
        final int n = 0;
        if ((token & 0x1) == 0x0) {
            f = false;
        }
        this.f = f;
        if (f) {
            token = n;
            if (extractedTextRequest != null) {
                token = extractedTextRequest.token;
            }
            this.e = token;
        }
        return a92.b.d0(this.d);
    }
    
    public final Handler getHandler() {
        return null;
    }
    
    public final CharSequence getSelectedText(final int n) {
        CharSequence f;
        if (o.b(this.d.b)) {
            f = null;
        }
        else {
            f = bg.d.g0(this.d).f;
        }
        return f;
    }
    
    public final CharSequence getTextAfterCursor(final int n, final int n2) {
        return bg.d.h0(this.d, n).f;
    }
    
    public final CharSequence getTextBeforeCursor(final int n, final int n2) {
        return bg.d.i0(this.d, n).f;
    }
    
    public final boolean performContextMenuAction(final int n) {
        boolean h;
        if (h = this.h) {
            h = false;
            switch (n) {
                case 16908322: {
                    this.c(279);
                    break;
                }
                case 16908321: {
                    this.c(278);
                    break;
                }
                case 16908320: {
                    this.c(277);
                    break;
                }
                case 16908319: {
                    this.a(new t(0, this.d.a.f.length()));
                    break;
                }
            }
        }
        return h;
    }
    
    public final boolean performEditorAction(int n) {
        boolean h;
        if (h = this.h) {
            h = true;
            Label_0128: {
                if (n != 0) {
                    switch (n) {
                        default: {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("IME sends unsupported Editor Action: ");
                            sb.append(n);
                            Log.w("RecordingIC", sb.toString());
                            break;
                        }
                        case 7: {
                            n = 5;
                            break Label_0128;
                        }
                        case 6: {
                            n = 7;
                            break Label_0128;
                        }
                        case 5: {
                            n = 6;
                            break Label_0128;
                        }
                        case 4: {
                            n = 4;
                            break Label_0128;
                        }
                        case 3: {
                            n = 3;
                            break Label_0128;
                        }
                        case 2: {
                            n = 2;
                            break Label_0128;
                        }
                    }
                }
                n = 1;
            }
            this.a.c(n);
        }
        return h;
    }
    
    public final boolean performPrivateCommand(final String s, final Bundle bundle) {
        boolean h;
        if (h = this.h) {
            h = true;
        }
        return h;
    }
    
    public final boolean reportFullscreenMode(final boolean b) {
        return false;
    }
    
    public final boolean requestCursorUpdates(final int n) {
        boolean h;
        if (h = this.h) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            h = false;
        }
        return h;
    }
    
    public final boolean sendKeyEvent(final KeyEvent keyEvent) {
        sg2.e.f((Object)keyEvent, "event");
        final boolean h = this.h;
        if (h) {
            this.a.a(keyEvent);
            return true;
        }
        return h;
    }
    
    public final boolean setComposingRegion(final int n, final int n2) {
        final boolean h = this.h;
        if (h) {
            this.a(new r(n, n2));
        }
        return h;
    }
    
    public final boolean setComposingText(final CharSequence charSequence, final int n) {
        final boolean h = this.h;
        if (h) {
            this.a(new s(String.valueOf(charSequence), n));
        }
        return h;
    }
    
    public final boolean setSelection(final int n, final int n2) {
        final boolean h = this.h;
        if (h) {
            this.a(new t(n, n2));
            return true;
        }
        return h;
    }
}
