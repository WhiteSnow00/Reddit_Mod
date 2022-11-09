// 
// Decompiled by Procyon v0.6.0
// 

package re;

import java.util.concurrent.FutureTask;
import android.os.RemoteException;
import java.util.Iterator;
import java.io.Serializable;
import qd.g2;
import java.util.concurrent.ExecutionException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import yd.a;
import android.os.Bundle;
import ke.g0;
import android.os.Parcel;
import ke.f0;

public abstract class s2 extends f0 implements t2
{
    public s2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    @Override
    public final boolean k(int n, Parcel e, final Parcel parcel) throws RemoteException {
        final boolean b = false;
        boolean b2 = false;
        switch (n) {
            default: {
                return false;
            }
            case 20: {
                final q7 q7 = (q7)g0.a((Parcel)e, re.q7.CREATOR);
                g0.b((Parcel)e);
                ((s4)this).u1(q7);
                parcel.writeNoException();
                break;
            }
            case 19: {
                final Bundle bundle = (Bundle)g0.a((Parcel)e, Bundle.CREATOR);
                final q7 q8 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                ((s4)this).g1(bundle, q8);
                parcel.writeNoException();
                break;
            }
            case 18: {
                final q7 q9 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                ((s4)this).z(q9);
                parcel.writeNoException();
                break;
            }
            case 17: {
                final String string = ((Parcel)e).readString();
                final String string2 = ((Parcel)e).readString();
                final String string3 = ((Parcel)e).readString();
                g0.b((Parcel)e);
                final List b3 = ((s4)this).b0(string, string2, string3);
                parcel.writeNoException();
                parcel.writeTypedList(b3);
                break;
            }
            case 16: {
                final String string4 = ((Parcel)e).readString();
                final String string5 = ((Parcel)e).readString();
                final q7 q10 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                final List m = ((s4)this).M(string4, string5, q10);
                parcel.writeNoException();
                parcel.writeTypedList(m);
                break;
            }
            case 15: {
                final String string6 = ((Parcel)e).readString();
                final String string7 = ((Parcel)e).readString();
                final String string8 = ((Parcel)e).readString();
                final ClassLoader a = g0.a;
                if (((Parcel)e).readInt() != 0) {
                    b2 = true;
                }
                g0.b((Parcel)e);
                final List a2 = ((s4)this).a1(string6, string7, string8, b2);
                parcel.writeNoException();
                parcel.writeTypedList(a2);
                break;
            }
            case 14: {
                final String string9 = ((Parcel)e).readString();
                final String string10 = ((Parcel)e).readString();
                final ClassLoader a3 = g0.a;
                boolean b4 = b;
                if (((Parcel)e).readInt() != 0) {
                    b4 = true;
                }
                final q7 q11 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                final List o1 = ((s4)this).o1(string9, string10, b4, q11);
                parcel.writeNoException();
                parcel.writeTypedList(o1);
                break;
            }
            case 13: {
                final c c = (c)g0.a((Parcel)e, re.c.CREATOR);
                g0.b((Parcel)e);
                final s4 s4 = (s4)this;
                a.S0((Object)c);
                a.S0((Object)c.h);
                a.P0(c.f);
                s4.x1(c.f, true);
                s4.J((Runnable)new j4(0, (Object)s4, (Object)new c(c)));
                parcel.writeNoException();
                break;
            }
            case 12: {
                final c c2 = (c)g0.a((Parcel)e, c.CREATOR);
                final q7 q12 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                ((s4)this).p1(c2, q12);
                parcel.writeNoException();
                break;
            }
            case 11: {
                final q7 q13 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                final String v = ((s4)this).V(q13);
                parcel.writeNoException();
                parcel.writeString(v);
                break;
            }
            case 10: {
                final long long1 = ((Parcel)e).readLong();
                final String string11 = ((Parcel)e).readString();
                final String string12 = ((Parcel)e).readString();
                final String string13 = ((Parcel)e).readString();
                g0.b((Parcel)e);
                ((s4)this).J0(long1, string11, string12, string13);
                parcel.writeNoException();
                break;
            }
            case 9: {
                final t t = (t)g0.a((Parcel)e, re.t.CREATOR);
                final String string14 = ((Parcel)e).readString();
                g0.b((Parcel)e);
                final byte[] e2 = ((s4)this).E(t, string14);
                parcel.writeNoException();
                parcel.writeByteArray(e2);
                break;
            }
            case 7: {
                final q7 q14 = (q7)g0.a((Parcel)e, q7.CREATOR);
                if (((Parcel)e).readInt() != 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                g0.b((Parcel)e);
                final s4 s5 = (s4)this;
                s5.R(q14);
                final String f = q14.f;
                a.S0((Object)f);
                e = (ExecutionException)s5.a.a().E((Callable)new q4((Object)s5, f, 0));
                Label_0915: {
                    try {
                        e = (ExecutionException)((FutureTask<List<?>>)e).get();
                        final Serializable s6 = new ArrayList<Object>(((List)e).size());
                        final Iterator<Object> iterator = ((List<Object>)e).iterator();
                        while (true) {
                            e = (ExecutionException)s6;
                            if (!iterator.hasNext()) {
                                break Label_0915;
                            }
                            e = (ExecutionException)iterator.next();
                            if (n == 0 && n7.k0(((l7)e).c)) {
                                continue;
                            }
                            ((ArrayList<j7>)s6).add(new j7((l7)e));
                        }
                    }
                    catch (final ExecutionException e) {}
                    catch (final InterruptedException ex) {}
                    s5.a.f().k.c(c3.H(q14.f), "Failed to get user properties. appId", e);
                    e = null;
                }
                parcel.writeNoException();
                parcel.writeTypedList((List)e);
                break;
            }
            case 6: {
                final q7 q15 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                ((s4)this).k1(q15);
                parcel.writeNoException();
                break;
            }
            case 5: {
                final t t2 = (t)g0.a((Parcel)e, t.CREATOR);
                final String string15 = ((Parcel)e).readString();
                ((Parcel)e).readString();
                g0.b((Parcel)e);
                final s4 s7 = (s4)this;
                a.S0((Object)t2);
                a.P0(string15);
                s7.x1(string15, true);
                s7.J((Runnable)new g2((Object)s7, 1, (Object)t2, (Object)string15));
                parcel.writeNoException();
                break;
            }
            case 4: {
                final q7 q16 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                ((s4)this).A(q16);
                parcel.writeNoException();
                break;
            }
            case 2: {
                final j7 j7 = (j7)g0.a((Parcel)e, re.j7.CREATOR);
                final q7 q17 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                ((s4)this).Z(j7, q17);
                parcel.writeNoException();
                break;
            }
            case 1: {
                final t t3 = (t)g0.a((Parcel)e, t.CREATOR);
                final q7 q18 = (q7)g0.a((Parcel)e, q7.CREATOR);
                g0.b((Parcel)e);
                ((s4)this).n1(t3, q18);
                parcel.writeNoException();
                break;
            }
        }
        return true;
    }
}
