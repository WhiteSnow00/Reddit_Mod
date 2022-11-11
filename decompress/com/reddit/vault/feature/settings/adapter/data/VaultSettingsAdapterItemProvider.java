// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.settings.adapter.data;

import kotlin.Result;
import u92.d;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import u92.j;
import java.util.List;
import lg2.c;
import javax.inject.Inject;
import rg2.a;
import u92.h;
import u92.h$a;
import sg2.e;
import u92.f;
import com.reddit.vault.domain.IsEligibleToCommunityPointsUseCase;
import com.reddit.vault.domain.GetCollectibleAvatarsUseCase;
import com.reddit.vault.feature.settings.adapter.data.section.VaultSection;
import ab2.g;
import com.reddit.vault.util.BiometricsHandler;
import fb2.m;
import v92.b;

public final class VaultSettingsAdapterItemProvider implements b
{
    public final t92.b a;
    public final m b;
    public final va2.b c;
    public final BiometricsHandler d;
    public final g e;
    public final VaultSection f;
    public final GetCollectibleAvatarsUseCase g;
    public final IsEligibleToCommunityPointsUseCase h;
    public Boolean i;
    public Boolean j;
    public final f k;
    public final f l;
    
    @Inject
    public VaultSettingsAdapterItemProvider(final t92.b a, final m b, final va2.b c, final BiometricsHandler d, final g e, final VaultSection f, final GetCollectibleAvatarsUseCase g, final IsEligibleToCommunityPointsUseCase h) {
        sg2.e.f((Object)a, "view");
        sg2.e.f((Object)b, "resourceProvider");
        sg2.e.f((Object)c, "secureDeviceUtil");
        sg2.e.f((Object)d, "biometricsHandler");
        sg2.e.f((Object)e, "navigator");
        sg2.e.f((Object)f, "vaultSection");
        sg2.e.f((Object)g, "getCollectibleAvatars");
        sg2.e.f((Object)h, "isEligibleToCommunityPoints");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        final String c2 = b.c(2131958098);
        final h$a a2 = h$a.a;
        final u92.g g2 = new u92.g(Integer.valueOf(2131232394), c2, (h)a2, (a)new VaultSettingsAdapterItemProvider$pointsDocsCard.VaultSettingsAdapterItemProvider$pointsDocsCard$1(this));
        final Integer value = 2131232047;
        final u92.g g3 = new u92.g(value, b.c(2131958096), (h)a2, (a)new VaultSettingsAdapterItemProvider$pointsDocsCard.VaultSettingsAdapterItemProvider$pointsDocsCard$2(this));
        final Integer value2 = 2131232458;
        this.k = new f(new u92.g[] { g2, g3, new u92.g(value2, b.c(2131958097), (h)a2, (a)new VaultSettingsAdapterItemProvider$pointsDocsCard.VaultSettingsAdapterItemProvider$pointsDocsCard$3(this)) });
        this.l = new f(new u92.g[] { new u92.g(value, b.c(2131958096), (h)a2, (a)new VaultSettingsAdapterItemProvider$collectiblesDocsCard.VaultSettingsAdapterItemProvider$collectiblesDocsCard$1(this)), new u92.g(value2, b.c(2131958097), (h)a2, (a)new VaultSettingsAdapterItemProvider$collectiblesDocsCard.VaultSettingsAdapterItemProvider$collectiblesDocsCard$2(this)) });
    }
    
    public final Object a(final c<? super List<? extends j>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1) {
                final VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1 vaultSettingsAdapterItemProvider$getItems$1 = (VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)c;
                final int label = vaultSettingsAdapterItemProvider$getItems$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    vaultSettingsAdapterItemProvider$getItems$1.label = label + Integer.MIN_VALUE;
                    o = vaultSettingsAdapterItemProvider$getItems$1;
                    break Label_0047;
                }
            }
            o = new VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1(this, (c)c);
        }
        Object o2 = ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).label;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object l$1 = null;
        VaultSettingsAdapterItemProvider vaultSettingsAdapterItemProvider = null;
        Label_0323: {
            VaultSettingsAdapterItemProvider l$2;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        o3 = ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$4;
                        o4 = ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$3;
                        o5 = ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$2;
                        l$1 = ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$1;
                        vaultSettingsAdapterItemProvider = (VaultSettingsAdapterItemProvider)((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$0;
                        yd.b.k0(o2);
                        break Label_0323;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$2 = (VaultSettingsAdapterItemProvider)((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$0;
                    yd.b.k0(o2);
                }
            }
            else {
                yd.b.k0(o2);
                ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$0 = this;
                ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).label = 1;
                if (this.b((c<? super hg2.j>)o) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$2 = this;
            }
            l$1 = new f(new u92.g[] { new u92.g(new Integer(2131232088), l$2.b.c(2131955087), (h)h$a.a, (a)new VaultSettingsAdapterItemProvider$getItems$otherCard.VaultSettingsAdapterItemProvider$getItems$otherCard$1((Object)l$2)) });
            final ArrayList l$3 = new ArrayList();
            final VaultSection f = l$2.f;
            ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$0 = l$2;
            ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$1 = l$1;
            ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$2 = l$3;
            ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$3 = l$3;
            ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).L$4 = l$3;
            ((VaultSettingsAdapterItemProvider$getItems.VaultSettingsAdapterItemProvider$getItems$1)o).label = 2;
            o2 = f.a((c<? super List<? extends j>>)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            final List<d> list = (List<d>)(o5 = l$3);
            final VaultSettingsAdapterItemProvider vaultSettingsAdapterItemProvider2 = l$2;
            o4 = o5;
            o3 = list;
            vaultSettingsAdapterItemProvider = vaultSettingsAdapterItemProvider2;
        }
        ((List)o3).addAll((Collection)o2);
        final Boolean j = vaultSettingsAdapterItemProvider.j;
        final Boolean true = Boolean.TRUE;
        if (sg2.e.a((Object)j, (Object)true)) {
            ((List<d>)o4).add(new d(vaultSettingsAdapterItemProvider.b.c(2131958095)));
            ((List<d>)o4).add((d)vaultSettingsAdapterItemProvider.l);
        }
        if (sg2.e.a((Object)vaultSettingsAdapterItemProvider.i, (Object)true)) {
            ((List<d>)o4).add(new d(vaultSettingsAdapterItemProvider.b.c(2131958099)));
            ((List<d>)o4).add((d)vaultSettingsAdapterItemProvider.k);
        }
        ((List<d>)o4).add(new d(vaultSettingsAdapterItemProvider.b.c(2131954914)));
        ((List<d>)o4).add((d)l$1);
        return o5;
    }
    
    public final Object b(final c<? super hg2.j> c) {
        VaultSettingsAdapterItemProvider$getVaultItemsEligibility.VaultSettingsAdapterItemProvider$getVaultItemsEligibility$1 vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1 = null;
        Label_0045: {
            if (c instanceof VaultSettingsAdapterItemProvider$getVaultItemsEligibility.VaultSettingsAdapterItemProvider$getVaultItemsEligibility$1) {
                vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1 = (VaultSettingsAdapterItemProvider$getVaultItemsEligibility.VaultSettingsAdapterItemProvider$getVaultItemsEligibility$1)c;
                final int label = vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.label = label + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1 = new VaultSettingsAdapterItemProvider$getVaultItemsEligibility.VaultSettingsAdapterItemProvider$getVaultItemsEligibility$1(this, (c)c);
        }
        Object result = vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.label;
        VaultSettingsAdapterItemProvider vaultSettingsAdapterItemProvider = null;
        Label_0302: {
            VaultSettingsAdapterItemProvider l$0 = null;
            Label_0250: {
                VaultSettingsAdapterItemProvider vaultSettingsAdapterItemProvider2;
                Object o;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            vaultSettingsAdapterItemProvider = (VaultSettingsAdapterItemProvider)vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.L$0;
                            yd.b.k0(result);
                            break Label_0302;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vaultSettingsAdapterItemProvider2 = (VaultSettingsAdapterItemProvider)vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.L$1;
                        final VaultSettingsAdapterItemProvider vaultSettingsAdapterItemProvider3 = (VaultSettingsAdapterItemProvider)vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.L$0;
                        yd.b.k0(result);
                        o = ((Result)result).unbox-impl();
                        l$0 = vaultSettingsAdapterItemProvider3;
                    }
                }
                else {
                    yd.b.k0(result);
                    if (this.j != null) {
                        l$0 = this;
                        break Label_0250;
                    }
                    final GetCollectibleAvatarsUseCase g = this.g;
                    vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.L$0 = this;
                    vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.L$1 = this;
                    vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.label = 1;
                    o = g.a((c)vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1);
                    if (o == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    vaultSettingsAdapterItemProvider2 = (l$0 = this);
                }
                Object o2 = o;
                if (Result.isFailure-impl(o)) {
                    o2 = null;
                }
                final List list = (List)o2;
                Boolean value;
                if (list != null) {
                    value = (list.isEmpty() ^ true);
                }
                else {
                    value = null;
                }
                vaultSettingsAdapterItemProvider2.j = value;
            }
            if (l$0.i != null) {
                return hg2.j.a;
            }
            final IsEligibleToCommunityPointsUseCase h = l$0.h;
            vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.L$0 = l$0;
            vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.L$1 = null;
            vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1.label = 2;
            final Object a = h.a((c)vaultSettingsAdapterItemProvider$getVaultItemsEligibility$1);
            if (a == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            vaultSettingsAdapterItemProvider = l$0;
            result = a;
        }
        vaultSettingsAdapterItemProvider.i = (Boolean)result;
        return hg2.j.a;
    }
}
