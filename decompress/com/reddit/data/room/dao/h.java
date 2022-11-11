// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import java.util.Iterator;
import a60.y1;
import android.os.CancellationSignal;
import j5.o;
import java.util.List;
import a60.a2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.util.concurrent.Callable;
import androidx.room.a;
import a60.z1;
import rg2.l;
import androidx.room.RoomDatabaseKt;
import a60.x1;
import lg2.c;
import java.util.ArrayList;
import j5.w;
import j5.d;
import b60.a0;
import j5.e;
import androidx.room.RoomDatabase;

public final class h implements g
{
    public final RoomDatabase f;
    public final h$b g;
    public final h$f h;
    
    public h(final RoomDatabase f) {
        this.f = f;
        new h$a(f);
        this.g = new h$b(f);
        new e<a0>(f) {
            public final String b() {
                return "INSERT OR IGNORE INTO `survey_status` (`surveyId`,`triggerCount`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final a0 a0 = (a0)o;
                final String a2 = a0.a;
                if (a2 == null) {
                    ((n5.c)e).bindNull(1);
                }
                else {
                    ((n5.c)e).bindString(1, a2);
                }
                ((n5.c)e).bindLong(2, a0.b);
            }
        };
        new d<a0>(f) {
            public final String b() {
                return "DELETE FROM `survey_status` WHERE `surveyId` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final String a = ((a0)o).a;
                if (a == null) {
                    ((n5.c)e).bindNull(1);
                }
                else {
                    ((n5.c)e).bindString(1, a);
                }
            }
        };
        new d<a0>(f) {
            public final String b() {
                return "UPDATE OR ABORT `survey_status` SET `surveyId` = ?,`triggerCount` = ? WHERE `surveyId` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final a0 a0 = (a0)o;
                final String a2 = a0.a;
                if (a2 == null) {
                    ((n5.c)e).bindNull(1);
                }
                else {
                    ((n5.c)e).bindString(1, a2);
                }
                ((n5.c)e).bindLong(2, a0.b);
                final String a3 = a0.a;
                if (a3 == null) {
                    ((n5.c)e).bindNull(3);
                }
                else {
                    ((n5.c)e).bindString(3, a3);
                }
            }
        };
        this.h = new w(f) {
            public final String b() {
                return "\n      DELETE FROM survey_status WHERE surveyId = ?\n    ";
            }
        };
        new h$g(f);
    }
    
    @Override
    public final Object L1(final ArrayList list, final c c) {
        return RoomDatabaseKt.b(this.f, (l<? super lg2.c<? super Object>, ?>)new x1(this, list), (lg2.c<? super Object>)c);
    }
    
    @Override
    public final Object S(final ArrayList list, final c c) {
        return androidx.room.a.c(this.f, (Callable)new z1(this, list), c);
    }
    
    @Override
    public final Object h2(final String s, final ContinuationImpl continuationImpl) {
        return androidx.room.a.c(this.f, (Callable)new a2(this, s), (c)continuationImpl);
    }
    
    @Override
    public final Object n0(final List list, final ContinuationImpl continuationImpl) {
        final StringBuilder q = d.q("\n", "      SELECT * FROM survey_status WHERE surveyId IN(");
        final int size = list.size();
        a4.a0.n(size, q);
        q.append(")");
        q.append("\n");
        q.append("    ");
        final o a = o.a(size + 0, q.toString());
        final Iterator iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (s == null) {
                a.bindNull(n);
            }
            else {
                a.bindString(n, s);
            }
            ++n;
        }
        return androidx.room.a.b(this.f, new CancellationSignal(), (Callable)new y1(this, a), (c)continuationImpl);
    }
}
