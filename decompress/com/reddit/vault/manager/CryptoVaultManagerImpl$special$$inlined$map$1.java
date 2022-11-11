// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.manager;

import hg2.j;
import com.reddit.vault.domain.repository.RedditBackupState;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import hj2.f;
import hj2.e;

public final class CryptoVaultManagerImpl$special$$inlined$map$1 implements e<VaultBackupState>
{
    public final /* synthetic */ e f;
    public final /* synthetic */ CryptoVaultManagerImpl g;
    
    public CryptoVaultManagerImpl$special$$inlined$map$1(final e f, final CryptoVaultManagerImpl g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object a(final f f, final c c) {
        final Object a = this.f.a(new f() {
            public final /* synthetic */ CryptoVaultManagerImpl g = CryptoVaultManagerImpl$special$$inlined$map$1.this.g;
            
            @Override
            public final Object emit(final Object o, final c c) {
                CryptoVaultManagerImpl$special$$inlined$map$1$2$1 cryptoVaultManagerImpl$special$$inlined$map$1$2$2 = null;
                Label_0050: {
                    if (c instanceof CryptoVaultManagerImpl$special$$inlined$map$1$2$1) {
                        final CryptoVaultManagerImpl$special$$inlined$map$1$2$1 cryptoVaultManagerImpl$special$$inlined$map$1$2$1 = (CryptoVaultManagerImpl$special$$inlined$map$1$2$1)c;
                        final int label = cryptoVaultManagerImpl$special$$inlined$map$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            cryptoVaultManagerImpl$special$$inlined$map$1$2$1.label = label + Integer.MIN_VALUE;
                            cryptoVaultManagerImpl$special$$inlined$map$1$2$2 = cryptoVaultManagerImpl$special$$inlined$map$1$2$1;
                            break Label_0050;
                        }
                    }
                    cryptoVaultManagerImpl$special$$inlined$map$1$2$2 = new CryptoVaultManagerImpl$special$$inlined$map$1$2$1(this, c);
                }
                final Object result = cryptoVaultManagerImpl$special$$inlined$map$1$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = cryptoVaultManagerImpl$special$$inlined$map$1$2$2.label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.k0(result);
                }
                else {
                    b.k0(result);
                    final f f = f;
                    final RedditBackupState redditBackupState = (RedditBackupState)o;
                    this.g.getClass();
                    final VaultBackupState k = CryptoVaultManagerImpl.k(redditBackupState);
                    cryptoVaultManagerImpl$special$$inlined$map$1$2$2.label = 1;
                    if (f.emit(k, (c<? super j>)cryptoVaultManagerImpl$special$$inlined$map$1$2$2) == coroutine_SUSPENDED) {
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
