// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import x82.u;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import ej2.j0;
import x82.m;
import hj2.s;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import x82.n0;
import com.reddit.vault.data.mapper.MnemonicMapper;
import com.reddit.vault.keystore.KeyStoreEncryption;
import android.content.SharedPreferences;
import rg2.a;
import y82.d;

public final class CredentialRepositoryImpl implements d
{
    public final a<SharedPreferences> a;
    public final KeyStoreEncryption b;
    public final MnemonicMapper c;
    public final n0 d;
    public final f e;
    
    @Inject
    public CredentialRepositoryImpl(final a<? extends SharedPreferences> a, final KeyStoreEncryption b, final MnemonicMapper c, final n0 d) {
        sg2.e.f((Object)a, "sharedPreferences");
        sg2.e.f((Object)b, "keyStoreEncryption");
        sg2.e.f((Object)c, "mnemonicMapper");
        sg2.e.f((Object)d, "user");
        this.a = (a<SharedPreferences>)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = kotlin.a.b((a)new CredentialRepositoryImpl$mutableAddress$2(this));
    }
    
    @Override
    public final Object a(final c<? super j> c) {
        CredentialRepositoryImpl$clear$1 credentialRepositoryImpl$clear$2 = null;
        Label_0047: {
            if (c instanceof CredentialRepositoryImpl$clear$1) {
                final CredentialRepositoryImpl$clear$1 credentialRepositoryImpl$clear$1 = (CredentialRepositoryImpl$clear$1)c;
                final int label = credentialRepositoryImpl$clear$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    credentialRepositoryImpl$clear$1.label = label + Integer.MIN_VALUE;
                    credentialRepositoryImpl$clear$2 = credentialRepositoryImpl$clear$1;
                    break Label_0047;
                }
            }
            credentialRepositoryImpl$clear$2 = new CredentialRepositoryImpl$clear$1(this, (c)c);
        }
        final Object result = credentialRepositoryImpl$clear$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = credentialRepositoryImpl$clear$2.label;
        CredentialRepositoryImpl credentialRepositoryImpl;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            credentialRepositoryImpl = (CredentialRepositoryImpl)credentialRepositoryImpl$clear$2.L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            this.a.invoke().edit().clear().apply();
            final KeyStoreEncryption b = this.b;
            final String f = this.d.f;
            credentialRepositoryImpl$clear$2.L$0 = this;
            credentialRepositoryImpl$clear$2.label = 1;
            if (b.c(f, (c)credentialRepositoryImpl$clear$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            credentialRepositoryImpl = this;
        }
        ((s)credentialRepositoryImpl.e.getValue()).setValue((Object)null);
        return j.a;
    }
    
    @Override
    public final Object b(final c<? super m> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof CredentialRepositoryImpl$getCredentials$1) {
                final CredentialRepositoryImpl$getCredentials$1 credentialRepositoryImpl$getCredentials$1 = (CredentialRepositoryImpl$getCredentials$1)c;
                final int label = credentialRepositoryImpl$getCredentials$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    credentialRepositoryImpl$getCredentials$1.label = label + Integer.MIN_VALUE;
                    o = credentialRepositoryImpl$getCredentials$1;
                    break Label_0047;
                }
            }
            o = new CredentialRepositoryImpl$getCredentials$1(this, (c)c);
        }
        Object o2 = ((CredentialRepositoryImpl$getCredentials$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((CredentialRepositoryImpl$getCredentials$1)o).label;
        final Object o3 = null;
        CredentialRepositoryImpl credentialRepositoryImpl;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    yd.b.k0(o2);
                    return o2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                credentialRepositoryImpl = (CredentialRepositoryImpl)((CredentialRepositoryImpl$getCredentials$1)o).L$0;
                yd.b.k0(o2);
            }
        }
        else {
            yd.b.k0(o2);
            final String string = this.a.invoke().getString("enc", (String)null);
            if (string == null) {
                return null;
            }
            final String string2 = this.a.invoke().getString("iv", (String)null);
            final Object o4 = o3;
            if (string2 == null) {
                return o4;
            }
            final byte[] a = ln2.a.a(string2);
            final KeyStoreEncryption b = this.b;
            final String f = this.d.f;
            b.getClass();
            sg2.e.f((Object)f, "userId");
            if (!b.f().containsAlias(KeyStoreEncryption.b(f))) {
                return null;
            }
            final mj2.a c2 = j0.c;
            final CredentialRepositoryImpl$getCredentials$phrase.CredentialRepositoryImpl$getCredentials$phrase$1 credentialRepositoryImpl$getCredentials$phrase$1 = new CredentialRepositoryImpl$getCredentials$phrase.CredentialRepositoryImpl$getCredentials$phrase$1(this, a, string, (c)null);
            ((CredentialRepositoryImpl$getCredentials$1)o).L$0 = this;
            ((CredentialRepositoryImpl$getCredentials$1)o).label = 1;
            o2 = g.l((CoroutineContext)c2, (p)credentialRepositoryImpl$getCredentials$phrase$1, (c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            credentialRepositoryImpl = this;
        }
        final String s = (String)o2;
        if (s == null) {
            return null;
        }
        final u u = new u(s);
        Object o4 = o3;
        if (!u.h) {
            return o4;
        }
        final MnemonicMapper c3 = credentialRepositoryImpl.c;
        ((CredentialRepositoryImpl$getCredentials$1)o).L$0 = null;
        ((CredentialRepositoryImpl$getCredentials$1)o).label = 2;
        if ((o2 = c3.c(u, (c)o)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        o4 = o2;
        return o4;
    }
    
    @Override
    public final Object c(m l$1, final c<? super j> c) {
        CredentialRepositoryImpl$storeCredentials$1 credentialRepositoryImpl$storeCredentials$2 = null;
        Label_0050: {
            if (c instanceof CredentialRepositoryImpl$storeCredentials$1) {
                final CredentialRepositoryImpl$storeCredentials$1 credentialRepositoryImpl$storeCredentials$1 = (CredentialRepositoryImpl$storeCredentials$1)c;
                final int label = credentialRepositoryImpl$storeCredentials$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    credentialRepositoryImpl$storeCredentials$1.label = label + Integer.MIN_VALUE;
                    credentialRepositoryImpl$storeCredentials$2 = credentialRepositoryImpl$storeCredentials$1;
                    break Label_0050;
                }
            }
            credentialRepositoryImpl$storeCredentials$2 = new CredentialRepositoryImpl$storeCredentials$1(this, (c)c);
        }
        final Object result = credentialRepositoryImpl$storeCredentials$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = credentialRepositoryImpl$storeCredentials$2.label;
        CredentialRepositoryImpl credentialRepositoryImpl;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$1 = (m)credentialRepositoryImpl$storeCredentials$2.L$1;
            credentialRepositoryImpl = (CredentialRepositoryImpl)credentialRepositoryImpl$storeCredentials$2.L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            final mj2.a c2 = j0.c;
            final CredentialRepositoryImpl$storeCredentials.CredentialRepositoryImpl$storeCredentials$2 credentialRepositoryImpl$storeCredentials$3 = new CredentialRepositoryImpl$storeCredentials.CredentialRepositoryImpl$storeCredentials$2(this, l$1, (c)null);
            credentialRepositoryImpl$storeCredentials$2.L$0 = this;
            credentialRepositoryImpl$storeCredentials$2.L$1 = l$1;
            credentialRepositoryImpl$storeCredentials$2.label = 1;
            if (g.l((CoroutineContext)c2, (p)credentialRepositoryImpl$storeCredentials$3, (c)credentialRepositoryImpl$storeCredentials$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            credentialRepositoryImpl = this;
        }
        ((s)credentialRepositoryImpl.e.getValue()).setValue((Object)l$1.i);
        return j.a;
    }
    
    @Override
    public final s getAddress() {
        return this.e.getValue();
    }
}
