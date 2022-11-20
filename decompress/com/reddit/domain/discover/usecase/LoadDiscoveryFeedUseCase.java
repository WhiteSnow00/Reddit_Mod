// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.discover.usecase;

import java.util.concurrent.CancellationException;
import java.io.IOException;
import com.reddit.common.experiments.model.discover.PageSizeVariant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Result;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import wa0.f;
import p20.b;
import hb0.a;

public final class LoadDiscoveryFeedUseCase
{
    public final a a;
    public final b b;
    public final f c;
    public final m41.a d;
    
    @Inject
    public LoadDiscoveryFeedUseCase(final a a, final b b, final f c, final m41.a d) {
        e.f((Object)a, "repository");
        e.f((Object)b, "resourceProvider");
        e.f((Object)c, "discoverFeatures");
        e.f((Object)d, "networkConnection");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(final String s, final boolean b, String s2, final boolean b2, final boolean b3, c<? super Result<gb0.a>> o) {
        Label_0059: {
            if (o instanceof LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1) {
                final LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1 loadDiscoveryFeedUseCase$loadDiscoveryFeed$1 = (LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1)o;
                final int label = loadDiscoveryFeedUseCase$loadDiscoveryFeed$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    loadDiscoveryFeedUseCase$loadDiscoveryFeed$1.label = label + Integer.MIN_VALUE;
                    o = loadDiscoveryFeedUseCase$loadDiscoveryFeed$1;
                    break Label_0059;
                }
            }
            o = new LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1(this, (c)o);
        }
        Object o2 = ((LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1)o).label;
        Label_0125: {
            if (label2 == 0) {
                break Label_0125;
            }
            Label_0115: {
                if (label2 != 1) {
                    break Label_0115;
                }
                o = (s2 = (String)((LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1)o).L$0);
                Label_0415: {
                    try {
                        cg.d.b4(o2);
                        break Label_0415;
                    }
                    catch (final CancellationException ex) {
                        throw ex;
                        Label_0228: {
                            final int n = 24;
                        }
                        while (true) {
                            Label_0232: {
                                break Label_0232;
                                return new Result.Error(((LoadDiscoveryFeedUseCase)o).b.getString(2131953342), false, null, 6, null);
                            Block_8_Outer:
                                while (true) {
                                    o2 = this.c.T5();
                                    e.c(o2);
                                    final boolean d = this.d.d();
                                    iftrue(Label_0228:)(o2 != PageSizeVariant.ALWAYS_SMALL && (o2 != PageSizeVariant.SMALL_ON_CELL_NETWORK || !(d ^ true)));
                                    int n2 = 0;
                                    Block_17: {
                                        break Block_17;
                                        int n;
                                        while (true) {
                                            while (true) {
                                                n = n2;
                                                break Label_0232;
                                                o2 = this.c.pa();
                                                e.c(o2);
                                                final boolean d2 = this.d.d();
                                                iftrue(Label_0228:)(o2 != PageSizeVariant.ALWAYS_SMALL && (o2 != PageSizeVariant.SMALL_ON_CELL_NETWORK || !(d2 ^ true)));
                                                continue Block_8_Outer;
                                            }
                                            cg.d.b4(o2);
                                            o2 = this.c.pa();
                                            n2 = 14;
                                            n = 24;
                                            iftrue(Label_0235:)(o2 == null);
                                            continue;
                                        }
                                        try {
                                            o2 = this.a;
                                            final boolean b4 = b2;
                                            final boolean b5 = px1.a.b0(this.c.Bc());
                                            final boolean b6 = b3;
                                            ((LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1)o).L$0 = this;
                                            ((LoadDiscoveryFeedUseCase$loadDiscoveryFeed$1)o).label = 1;
                                            o2 = ((a)o2).b(b, s2, n, s, b4, b5, b6, (c)o);
                                            if (o2 == coroutine_SUSPENDED) {
                                                return coroutine_SUSPENDED;
                                            }
                                            final LoadDiscoveryFeedUseCase loadDiscoveryFeedUseCase = this;
                                            o = loadDiscoveryFeedUseCase;
                                            s2 = (String)loadDiscoveryFeedUseCase;
                                            final gb0.a a = (gb0.a)o2;
                                            if (a != null) {
                                                o = loadDiscoveryFeedUseCase;
                                                s2 = (String)loadDiscoveryFeedUseCase;
                                                o2 = new(com.reddit.domain.model.Result.Success.class)();
                                                o = loadDiscoveryFeedUseCase;
                                                s2 = (String)loadDiscoveryFeedUseCase;
                                                new Result.Success(a);
                                                return error;
                                            }
                                            o = loadDiscoveryFeedUseCase;
                                            s2 = (String)loadDiscoveryFeedUseCase;
                                            final Result.Error error2 = new Result.Error(loadDiscoveryFeedUseCase.b.getString(2131953281), false, null, 6, null);
                                            return error;
                                        }
                                        catch (final IOException ex2) {
                                            o = this;
                                        }
                                        finally {
                                            s2 = (String)this;
                                        }
                                        return new Result.Error(((LoadDiscoveryFeedUseCase)o).b.getString(2131953342), false, null, 6, null);
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int n = n2;
                                    break Label_0232;
                                    Label_0235:
                                    iftrue(Label_0321:)(this.c.T5() == null);
                                    continue;
                                }
                            }
                            continue;
                        }
                    }
                    catch (final IOException ex3) {
                        return new Result.Error(((LoadDiscoveryFeedUseCase)o).b.getString(2131953342), false, null, 6, null);
                    }
                    finally {
                        goto Label_0495;
                    }
                }
            }
        }
    }
}
