// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.collectibleavatars;

import z0.t0;
import z0.y0;
import rg2.q;
import androidx.compose.runtime.ComposerKt;
import javax.inject.Inject;
import rg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import h1.b;
import sg2.e;
import qn1.j;
import ab2.d;
import ej2.b0;
import ab2.g;
import ca2.c;
import ca2.f;
import com.reddit.screen.presentation.CompositionViewModel;

public final class a extends CompositionViewModel<f, c>
{
    public final g h;
    public final h92.a i;
    public final b0 j;
    
    @Inject
    public a(final d h, final h92.a i, final b0 j, final gk1.a a, final j k) {
        e.f((Object)i, "recoveryPhraseListener");
        super(j, (b)a, com.reddit.screen.a.b(k), false);
        this.h = (g)h;
        this.i = i;
        ej2.g.i(this.j = j, (CoroutineContext)null, (CoroutineStart)null, (p)new LearnAboutCollectibleAvatarsViewModel$1(this, null), 3);
    }
    
    public final Object h(final z0.d d) {
        d.A(-375125092);
        final q<z0.c<?>, y0, t0, hg2.j> a = ComposerKt.a;
        final f f = new f(lw0.b.s1((Object[])new ca2.a[] { new ca2.a(2131955329, 2131955324, "https://www.redditstatic.com/marketplace-assets/v1/mobile/vault/collectible_avatars/collectible_avatars_educational_item1.png"), new ca2.a(2131955331, 2131955326, "https://www.redditstatic.com/marketplace-assets/v1/mobile/vault/collectible_avatars/collectible_avatars_educational_item2.png"), new ca2.a(2131955330, 2131955325, "https://www.redditstatic.com/marketplace-assets/v1/mobile/vault/collectible_avatars/collectible_avatars_educational_item3.png"), new ca2.a(2131955327, 2131955322, "https://www.redditstatic.com/marketplace-assets/v1/mobile/vault/collectible_avatars/collectible_avatars_educational_item4.png"), new ca2.a(2131955328, 2131955323, "https://www.redditstatic.com/marketplace-assets/v1/mobile/vault/collectible_avatars/collectible_avatars_educational_item5.png") }));
        d.I();
        return f;
    }
}
