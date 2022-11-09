// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import android.database.Cursor;
import java.util.ArrayList;
import l5.c;
import j5.o;
import j60.e;
import java.util.List;
import java.util.concurrent.Callable;

public final class k1 implements Callable<List<e>>
{
    public final /* synthetic */ o f;
    public final /* synthetic */ v0 g;
    
    public k1(final v0 g, final o f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        final Cursor b = c.b(this.g.f, this.f, false);
        try {
            final ArrayList list = new ArrayList<e>(b.getCount());
            while (b.moveToNext()) {
                final boolean null = b.isNull(0);
                final Boolean b2 = null;
                String string;
                if (null) {
                    string = null;
                }
                else {
                    string = b.getString(0);
                }
                final boolean b3 = true;
                String string2;
                if (b.isNull(1)) {
                    string2 = null;
                }
                else {
                    string2 = b.getString(1);
                }
                String string3;
                if (b.isNull(2)) {
                    string3 = null;
                }
                else {
                    string3 = b.getString(2);
                }
                String string4;
                if (b.isNull(3)) {
                    string4 = null;
                }
                else {
                    string4 = b.getString(3);
                }
                String string5;
                if (b.isNull(4)) {
                    string5 = null;
                }
                else {
                    string5 = b.getString(4);
                }
                String string6;
                if (b.isNull(5)) {
                    string6 = null;
                }
                else {
                    string6 = b.getString(5);
                }
                String string7;
                if (b.isNull(6)) {
                    string7 = null;
                }
                else {
                    string7 = b.getString(6);
                }
                String string8;
                if (b.isNull(7)) {
                    string8 = null;
                }
                else {
                    string8 = b.getString(7);
                }
                String string9;
                if (b.isNull(8)) {
                    string9 = null;
                }
                else {
                    string9 = b.getString(8);
                }
                Integer value;
                if (b.isNull(9)) {
                    value = null;
                }
                else {
                    value = b.getInt(9);
                }
                Boolean value2;
                if (value == null) {
                    value2 = null;
                }
                else {
                    value2 = (value != 0);
                }
                final boolean b4 = b.getInt(10) != 0;
                Integer value3;
                if (b.isNull(11)) {
                    value3 = null;
                }
                else {
                    value3 = b.getInt(11);
                }
                Boolean value4;
                if (value3 == null) {
                    value4 = null;
                }
                else {
                    value4 = (value3 != 0);
                }
                Integer value5;
                if (b.isNull(12)) {
                    value5 = null;
                }
                else {
                    value5 = b.getInt(12);
                }
                Boolean value6;
                if (value5 == null) {
                    value6 = null;
                }
                else {
                    value6 = (value5 != 0);
                }
                Integer value7;
                if (b.isNull(13)) {
                    value7 = null;
                }
                else {
                    value7 = b.getInt(13);
                }
                Boolean value8;
                if (value7 == null) {
                    value8 = b2;
                }
                else {
                    value8 = (value7 != 0 && b3);
                }
                list.add(new e(string, string2, string3, string4, string5, string6, string7, string8, string9, value2, b4, value4, value6, value8));
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
