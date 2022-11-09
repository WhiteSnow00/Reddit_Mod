// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import android.database.Cursor;
import i60.e;
import com.reddit.data.room.model.CommentDataModelType;
import ah2.f;
import java.util.ArrayList;
import l5.b;
import l5.c;
import j5.o;
import i60.d;
import java.util.List;
import java.util.concurrent.Callable;

public final class l implements Callable<List<d>>
{
    public final /* synthetic */ o f;
    public final /* synthetic */ k g;
    
    public l(final k g, final o f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        final Cursor b = c.b(this.g.f, this.f, false);
        try {
            final int b2 = l5.b.b(b, "commentId");
            final int b3 = l5.b.b(b, "parentId");
            final int b4 = l5.b.b(b, "linkId");
            final int b5 = l5.b.b(b, "listingPosition");
            final int b6 = l5.b.b(b, "commentJson");
            final int b7 = l5.b.b(b, "sortType");
            final int b8 = l5.b.b(b, "type");
            final int b9 = l5.b.b(b, "id");
            final int b10 = l5.b.b(b, "isCollapsed");
            final ArrayList list = new ArrayList<d>(b.getCount());
            while (true) {
                final i60.f f = null;
                final String s = null;
                if (!b.moveToNext()) {
                    break;
                }
                e e;
                if (b.isNull(b2) && b.isNull(b3) && b.isNull(b4) && b.isNull(b5) && b.isNull(b6) && b.isNull(b7) && b.isNull(b8)) {
                    e = null;
                }
                else {
                    String string;
                    if (b.isNull(b2)) {
                        string = null;
                    }
                    else {
                        string = b.getString(b2);
                    }
                    String string2;
                    if (b.isNull(b3)) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b3);
                    }
                    String string3;
                    if (b.isNull(b4)) {
                        string3 = null;
                    }
                    else {
                        string3 = b.getString(b4);
                    }
                    final int int1 = b.getInt(b5);
                    String string4;
                    if (b.isNull(b6)) {
                        string4 = null;
                    }
                    else {
                        string4 = b.getString(b6);
                    }
                    String string5;
                    if (b.isNull(b7)) {
                        string5 = null;
                    }
                    else {
                        string5 = b.getString(b7);
                    }
                    String string6;
                    if (b.isNull(b8)) {
                        string6 = null;
                    }
                    else {
                        string6 = b.getString(b8);
                    }
                    ah2.f.f((Object)string6, "name");
                    e = new e(string, string2, string3, int1, string4, string5, CommentDataModelType.valueOf(string6));
                }
                i60.f f2 = null;
                Label_0503: {
                    if (b.isNull(b9)) {
                        f2 = f;
                        if (b.isNull(b10)) {
                            break Label_0503;
                        }
                    }
                    String string7;
                    if (b.isNull(b9)) {
                        string7 = s;
                    }
                    else {
                        string7 = b.getString(b9);
                    }
                    f2 = new i60.f(string7, b.getInt(b10) != 0);
                }
                list.add(new d(e, f2));
            }
            return list;
        }
        finally {
            b.close();
        }
    }
    
    public final void finalize() {
        this.f.h();
    }
}
