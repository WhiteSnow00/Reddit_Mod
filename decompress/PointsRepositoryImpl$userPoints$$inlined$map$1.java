// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import java.util.Iterator;
import hg2.j;
import x82.h;
import java.util.Collection;
import java.util.List;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import hj2.f;
import hj2.e;

public final class PointsRepositoryImpl$userPoints$$inlined$map$1 implements e<Boolean>
{
    public final /* synthetic */ e f;
    public final /* synthetic */ String g;
    
    public PointsRepositoryImpl$userPoints$$inlined$map$1(final e f, final String g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object a(final f f, final c c) {
        final Object a = this.f.a(new f() {
            public final /* synthetic */ String g = PointsRepositoryImpl$userPoints$$inlined$map$1.this.g;
            
            @Override
            public final Object emit(final Object o, final c c) {
                Object o2 = null;
                Label_0050: {
                    if (c instanceof PointsRepositoryImpl$userPoints$$inlined$map$1$2$1) {
                        final PointsRepositoryImpl$userPoints$$inlined$map$1$2$1 pointsRepositoryImpl$userPoints$$inlined$map$1$2$1 = (PointsRepositoryImpl$userPoints$$inlined$map$1$2$1)c;
                        final int label = pointsRepositoryImpl$userPoints$$inlined$map$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            pointsRepositoryImpl$userPoints$$inlined$map$1$2$1.label = label + Integer.MIN_VALUE;
                            o2 = pointsRepositoryImpl$userPoints$$inlined$map$1$2$1;
                            break Label_0050;
                        }
                    }
                    o2 = new PointsRepositoryImpl$userPoints$$inlined$map$1$2$1(this, c);
                }
                final Object result = ((PointsRepositoryImpl$userPoints$$inlined$map$1$2$1)o2).result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = ((PointsRepositoryImpl$userPoints$$inlined$map$1$2$1)o2).label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.k0(result);
                }
                else {
                    b.k0(result);
                    final f f = f;
                    final List list = (List)o;
                    final boolean b = list instanceof Collection;
                    final boolean b2 = false;
                    boolean b3 = false;
                    Label_0186: {
                        if (b && list.isEmpty()) {
                            b3 = b2;
                        }
                        else {
                            final Iterator iterator = list.iterator();
                            do {
                                b3 = b2;
                                if (iterator.hasNext()) {
                                    continue;
                                }
                                break Label_0186;
                            } while (!sg2.e.a((Object)((h)iterator.next()).f, (Object)this.g));
                            b3 = true;
                        }
                    }
                    ((PointsRepositoryImpl$userPoints$$inlined$map$1$2$1)o2).label = 1;
                    if (f.emit(b3, (c<? super j>)o2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                return j.a;
            }
        }, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
