// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.manager;

import hj2.a0;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.vault.domain.repository.RedditBackupState;
import hg2.j;
import o82.b$a;
import com.reddit.vault.data.remote.RemoteVaultDataSourceKt;
import kotlin.Result;
import x82.m;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import kotlinx.coroutines.sync.MutexImpl;
import x82.u;
import com.reddit.vault.data.mapper.MnemonicMapper;
import com.reddit.vault.domain.GetActiveVaultUseCase;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import y82.d;
import wa2.a;

public final class CryptoVaultManagerImpl implements a
{
    public final a20.a a;
    public final d b;
    public final RemoteVaultDataSource c;
    public final y82.a d;
    public final GetActiveVaultUseCase e;
    public final MnemonicMapper f;
    public final r82.a g;
    public u h;
    public final MutexImpl i;
    
    @Inject
    public CryptoVaultManagerImpl(final a20.a a, final d b, final RemoteVaultDataSource c, final y82.a d, final GetActiveVaultUseCase e, final MnemonicMapper f, final r82.a g) {
        sg2.e.f((Object)a, "coroutinesDispatcher");
        sg2.e.f((Object)b, "credentialRepository");
        sg2.e.f((Object)c, "remoteVaultDataSource");
        sg2.e.f((Object)d, "accountRepository");
        sg2.e.f((Object)e, "getActiveVaultUseCase");
        sg2.e.f((Object)f, "mnemonicMapper");
        sg2.e.f((Object)g, "cryptoContractRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = new MutexImpl(false);
    }
    
    public static final Object i(CryptoVaultManagerImpl cryptoVaultManagerImpl, final c c) {
        cryptoVaultManagerImpl.getClass();
        CryptoVaultManagerImpl$createVaultInternally$1 cryptoVaultManagerImpl$createVaultInternally$1 = null;
        Label_0050: {
            if (c instanceof CryptoVaultManagerImpl$createVaultInternally$1) {
                cryptoVaultManagerImpl$createVaultInternally$1 = (CryptoVaultManagerImpl$createVaultInternally$1)c;
                final int label = cryptoVaultManagerImpl$createVaultInternally$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    cryptoVaultManagerImpl$createVaultInternally$1.label = label + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            cryptoVaultManagerImpl$createVaultInternally$1 = new CryptoVaultManagerImpl$createVaultInternally$1(cryptoVaultManagerImpl, c);
        }
        Object o = cryptoVaultManagerImpl$createVaultInternally$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = cryptoVaultManagerImpl$createVaultInternally$1.label;
        m m = null;
        CryptoVaultManagerImpl cryptoVaultManagerImpl2 = null;
        Object a = null;
        Label_0311: {
            Object c2 = null;
            Label_0257: {
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            cryptoVaultManagerImpl = (CryptoVaultManagerImpl)cryptoVaultManagerImpl$createVaultInternally$1.L$0;
                            b.k0(o);
                            c2 = o;
                            break Label_0257;
                        }
                        if (label2 == 3) {
                            m = (m)cryptoVaultManagerImpl$createVaultInternally$1.L$1;
                            cryptoVaultManagerImpl2 = (CryptoVaultManagerImpl)cryptoVaultManagerImpl$createVaultInternally$1.L$0;
                            b.k0(o);
                            a = o;
                            break Label_0311;
                        }
                        if (label2 == 4) {
                            final m i = (m)cryptoVaultManagerImpl$createVaultInternally$1.L$0;
                            b.k0(o);
                            final m j = i;
                            return Result.constructor-impl((Object)j.i);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        cryptoVaultManagerImpl = (CryptoVaultManagerImpl)cryptoVaultManagerImpl$createVaultInternally$1.L$0;
                        b.k0(o);
                    }
                }
                else {
                    b.k0(o);
                    cryptoVaultManagerImpl$createVaultInternally$1.L$0 = cryptoVaultManagerImpl;
                    cryptoVaultManagerImpl$createVaultInternally$1.label = 1;
                    if ((o = cryptoVaultManagerImpl.j((c<? super u>)cryptoVaultManagerImpl$createVaultInternally$1)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                final u u = (u)o;
                final MnemonicMapper f = cryptoVaultManagerImpl.f;
                cryptoVaultManagerImpl$createVaultInternally$1.L$0 = cryptoVaultManagerImpl;
                cryptoVaultManagerImpl$createVaultInternally$1.label = 2;
                if ((c2 = f.c(u, (c)cryptoVaultManagerImpl$createVaultInternally$1)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final CryptoVaultManagerImpl l$0 = cryptoVaultManagerImpl;
            m = (m)c2;
            final RemoteVaultDataSource c3 = l$0.c;
            cryptoVaultManagerImpl$createVaultInternally$1.L$0 = l$0;
            cryptoVaultManagerImpl$createVaultInternally$1.L$1 = m;
            cryptoVaultManagerImpl$createVaultInternally$1.label = 3;
            a = RemoteVaultDataSourceKt.a(c3, m, (c)cryptoVaultManagerImpl$createVaultInternally$1);
            if (a == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            cryptoVaultManagerImpl2 = l$0;
        }
        final o82.b b = (o82.b)a;
        if (b instanceof b$a) {
            Exception a2;
            if ((a2 = ((b$a)b).a) == null) {
                a2 = new IllegalStateException("Unknown error when trying to publish address");
            }
            return Result.constructor-impl((Object)yd.b.o((Throwable)a2));
        }
        final d b2 = cryptoVaultManagerImpl2.b;
        cryptoVaultManagerImpl$createVaultInternally$1.L$0 = m;
        cryptoVaultManagerImpl$createVaultInternally$1.L$1 = null;
        cryptoVaultManagerImpl$createVaultInternally$1.label = 4;
        final m j = m;
        if (b2.c(m, (c<? super j>)cryptoVaultManagerImpl$createVaultInternally$1) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return Result.constructor-impl((Object)j.i);
    }
    
    public static VaultBackupState k(final RedditBackupState redditBackupState) {
        final int n = CryptoVaultManagerImpl.CryptoVaultManagerImpl$a.a[((Enum)redditBackupState).ordinal()];
        VaultBackupState vaultBackupState;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vaultBackupState = VaultBackupState.BACKED_UP;
            }
            else {
                vaultBackupState = VaultBackupState.MISSING;
            }
        }
        else {
            vaultBackupState = VaultBackupState.UNKNOWN;
        }
        return vaultBackupState;
    }
    
    public final x82.a a() {
        return (x82.a)((a0)this.b.getAddress()).getValue();
    }
    
    public final Object b(final c<? super Result<? extends VaultState>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof CryptoVaultManagerImpl$getVaultState$1) {
                final CryptoVaultManagerImpl$getVaultState$1 cryptoVaultManagerImpl$getVaultState$1 = (CryptoVaultManagerImpl$getVaultState$1)c;
                final int label = cryptoVaultManagerImpl$getVaultState$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    cryptoVaultManagerImpl$getVaultState$1.label = label + Integer.MIN_VALUE;
                    o = cryptoVaultManagerImpl$getVaultState$1;
                    break Label_0047;
                }
            }
            o = new CryptoVaultManagerImpl$getVaultState$1(this, (c)c);
        }
        final Object result = ((CryptoVaultManagerImpl$getVaultState$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((CryptoVaultManagerImpl$getVaultState$1)o).label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final mj2.a c2 = this.a.c();
            final CryptoVaultManagerImpl$getVaultState$2 cryptoVaultManagerImpl$getVaultState$2 = new CryptoVaultManagerImpl$getVaultState$2(this, (c)null);
            ((CryptoVaultManagerImpl$getVaultState$1)o).label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (p)cryptoVaultManagerImpl$getVaultState$2, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((Result)l).unbox-impl();
    }
    
    public final Object c(final c<? super m> c) {
        return this.b.b(c);
    }
    
    public final Object d(final c<? super Result<x82.a>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof CryptoVaultManagerImpl$createVault$1) {
                final CryptoVaultManagerImpl$createVault$1 cryptoVaultManagerImpl$createVault$1 = (CryptoVaultManagerImpl$createVault$1)c;
                final int label = cryptoVaultManagerImpl$createVault$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    cryptoVaultManagerImpl$createVault$1.label = label + Integer.MIN_VALUE;
                    o = cryptoVaultManagerImpl$createVault$1;
                    break Label_0047;
                }
            }
            o = new CryptoVaultManagerImpl$createVault$1(this, (c)c);
        }
        final Object result = ((CryptoVaultManagerImpl$createVault$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((CryptoVaultManagerImpl$createVault$1)o).label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final mj2.a c2 = this.a.c();
            final CryptoVaultManagerImpl$createVault$2 cryptoVaultManagerImpl$createVault$2 = new CryptoVaultManagerImpl$createVault$2(this, (c)null);
            ((CryptoVaultManagerImpl$createVault$1)o).label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (p)cryptoVaultManagerImpl$createVault$2, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((Result)l).unbox-impl();
    }
    
    public final Boolean e() {
        return this.a() != null;
    }
    
    public final CryptoVaultManagerImpl$special$$inlined$map$1 f() {
        return new CryptoVaultManagerImpl$special$$inlined$map$1(this.d.n(), this);
    }
    
    public final VaultBackupState g() {
        return k(this.d.q());
    }
    
    public final Object h(final c<? super Result<x82.a>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof CryptoVaultManagerImpl$getActiveVault$1) {
                final CryptoVaultManagerImpl$getActiveVault$1 cryptoVaultManagerImpl$getActiveVault$1 = (CryptoVaultManagerImpl$getActiveVault$1)c;
                final int label = cryptoVaultManagerImpl$getActiveVault$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    cryptoVaultManagerImpl$getActiveVault$1.label = label + Integer.MIN_VALUE;
                    o = cryptoVaultManagerImpl$getActiveVault$1;
                    break Label_0047;
                }
            }
            o = new CryptoVaultManagerImpl$getActiveVault$1(this, (c)c);
        }
        final Object result = ((CryptoVaultManagerImpl$getActiveVault$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((CryptoVaultManagerImpl$getActiveVault$1)o).label;
        Object o2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            o2 = ((Result)result).unbox-impl();
        }
        else {
            yd.b.k0(result);
            final x82.a a = this.a();
            if (a != null) {
                return Result.constructor-impl((Object)a);
            }
            final GetActiveVaultUseCase e = this.e;
            ((CryptoVaultManagerImpl$getActiveVault$1)o).label = 1;
            if ((o2 = e.a((c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        if (Result.isFailure-impl(o2)) {
            return Result.constructor-impl((Object)yd.b.o((Throwable)CryptoVaultManagerError$NetworkFailure.INSTANCE));
        }
        final boolean failure-impl = Result.isFailure-impl(o2);
        final Object o3 = null;
        if (failure-impl) {
            o2 = null;
        }
        final w82.c c2 = (w82.c)o2;
        Object a2 = o3;
        if (c2 != null) {
            a2 = ui.b.A(c2);
        }
        Object o4;
        if (a2 != null) {
            o4 = Result.constructor-impl(a2);
        }
        else {
            o4 = Result.constructor-impl((Object)yd.b.o((Throwable)CryptoVaultManagerError$NoActiveVaultFound.INSTANCE));
        }
        return o4;
    }
    
    public final Object j(final c<? super u> c) {
        CryptoVaultManagerImpl$generateMnemonic$1 cryptoVaultManagerImpl$generateMnemonic$2 = null;
        Label_0047: {
            if (c instanceof CryptoVaultManagerImpl$generateMnemonic$1) {
                final CryptoVaultManagerImpl$generateMnemonic$1 cryptoVaultManagerImpl$generateMnemonic$1 = (CryptoVaultManagerImpl$generateMnemonic$1)c;
                final int label = cryptoVaultManagerImpl$generateMnemonic$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    cryptoVaultManagerImpl$generateMnemonic$1.label = label + Integer.MIN_VALUE;
                    cryptoVaultManagerImpl$generateMnemonic$2 = cryptoVaultManagerImpl$generateMnemonic$1;
                    break Label_0047;
                }
            }
            cryptoVaultManagerImpl$generateMnemonic$2 = new CryptoVaultManagerImpl$generateMnemonic$1(this, (c)c);
        }
        final Object result = cryptoVaultManagerImpl$generateMnemonic$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = cryptoVaultManagerImpl$generateMnemonic$2.label;
        CryptoVaultManagerImpl cryptoVaultManagerImpl;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cryptoVaultManagerImpl = (CryptoVaultManagerImpl)cryptoVaultManagerImpl$generateMnemonic$2.L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            if (this.h == null) {
                final mj2.a c2 = this.a.c();
                final CryptoVaultManagerImpl$generateMnemonic$2 cryptoVaultManagerImpl$generateMnemonic$3 = new CryptoVaultManagerImpl$generateMnemonic$2(this, (c)null);
                cryptoVaultManagerImpl$generateMnemonic$2.L$0 = this;
                cryptoVaultManagerImpl$generateMnemonic$2.label = 1;
                if (ej2.g.l((CoroutineContext)c2, (p)cryptoVaultManagerImpl$generateMnemonic$3, (c)cryptoVaultManagerImpl$generateMnemonic$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            cryptoVaultManagerImpl = this;
        }
        final u h = cryptoVaultManagerImpl.h;
        sg2.e.c((Object)h);
        return h;
    }
}
