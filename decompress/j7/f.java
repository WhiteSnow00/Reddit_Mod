// 
// Decompiled by Procyon v0.6.0
// 

package j7;

import x1.a;
import v0.h;
import x1.c;
import sg2.e;
import androidx.compose.foundation.text.KeyCommand;
import android.view.KeyEvent;
import rg2.l;
import v0.b;

public final class f implements e$b, b
{
    public final /* synthetic */ l b;
    
    public void a(final e$a e$a) {
        this.b.invoke(e$a);
    }
    
    public KeyCommand b(final KeyEvent keyEvent) {
        e.f((Object)keyEvent, "event");
        final boolean booleanValue = this.b.invoke(new x1.b(keyEvent));
        final KeyCommand keyCommand = null;
        KeyCommand keyCommand2;
        if (booleanValue && keyEvent.isShiftPressed()) {
            final long i = c.i(keyEvent);
            final int w = h.w;
            keyCommand2 = keyCommand;
            if (a.a(i, h.f)) {
                keyCommand2 = KeyCommand.REDO;
            }
        }
        else if (this.b.invoke(new x1.b(keyEvent))) {
            final long j = c.i(keyEvent);
            final int w2 = h.w;
            if (a.a(j, h.b) || a.a(j, h.p)) {
                keyCommand2 = KeyCommand.COPY;
            }
            else if (a.a(j, h.d)) {
                keyCommand2 = KeyCommand.PASTE;
            }
            else if (a.a(j, h.e)) {
                keyCommand2 = KeyCommand.CUT;
            }
            else if (a.a(j, h.a)) {
                keyCommand2 = KeyCommand.SELECT_ALL;
            }
            else {
                keyCommand2 = keyCommand;
                if (a.a(j, h.f)) {
                    keyCommand2 = KeyCommand.UNDO;
                }
            }
        }
        else if (keyEvent.isCtrlPressed()) {
            keyCommand2 = keyCommand;
        }
        else if (keyEvent.isShiftPressed()) {
            final long k = c.i(keyEvent);
            final int w3 = h.w;
            if (a.a(k, h.h)) {
                keyCommand2 = KeyCommand.SELECT_LEFT_CHAR;
            }
            else if (a.a(k, h.i)) {
                keyCommand2 = KeyCommand.SELECT_RIGHT_CHAR;
            }
            else if (a.a(k, h.j)) {
                keyCommand2 = KeyCommand.SELECT_UP;
            }
            else if (a.a(k, h.k)) {
                keyCommand2 = KeyCommand.SELECT_DOWN;
            }
            else if (a.a(k, h.l)) {
                keyCommand2 = KeyCommand.SELECT_PAGE_UP;
            }
            else if (a.a(k, h.m)) {
                keyCommand2 = KeyCommand.SELECT_PAGE_DOWN;
            }
            else if (a.a(k, h.n)) {
                keyCommand2 = KeyCommand.SELECT_LINE_START;
            }
            else if (a.a(k, h.o)) {
                keyCommand2 = KeyCommand.SELECT_LINE_END;
            }
            else {
                keyCommand2 = keyCommand;
                if (a.a(k, h.p)) {
                    keyCommand2 = KeyCommand.PASTE;
                }
            }
        }
        else {
            final long l = c.i(keyEvent);
            final int w4 = h.w;
            if (a.a(l, h.h)) {
                keyCommand2 = KeyCommand.LEFT_CHAR;
            }
            else if (a.a(l, h.i)) {
                keyCommand2 = KeyCommand.RIGHT_CHAR;
            }
            else if (a.a(l, h.j)) {
                keyCommand2 = KeyCommand.UP;
            }
            else if (a.a(l, h.k)) {
                keyCommand2 = KeyCommand.DOWN;
            }
            else if (a.a(l, h.l)) {
                keyCommand2 = KeyCommand.PAGE_UP;
            }
            else if (a.a(l, h.m)) {
                keyCommand2 = KeyCommand.PAGE_DOWN;
            }
            else if (a.a(l, h.n)) {
                keyCommand2 = KeyCommand.LINE_START;
            }
            else if (a.a(l, h.o)) {
                keyCommand2 = KeyCommand.LINE_END;
            }
            else if (a.a(l, h.q)) {
                keyCommand2 = KeyCommand.NEW_LINE;
            }
            else if (a.a(l, h.r)) {
                keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
            }
            else if (a.a(l, h.s)) {
                keyCommand2 = KeyCommand.DELETE_NEXT_CHAR;
            }
            else if (a.a(l, h.t)) {
                keyCommand2 = KeyCommand.PASTE;
            }
            else if (a.a(l, h.u)) {
                keyCommand2 = KeyCommand.CUT;
            }
            else {
                keyCommand2 = keyCommand;
                if (a.a(l, h.v)) {
                    keyCommand2 = KeyCommand.TAB;
                }
            }
        }
        return keyCommand2;
    }
}
