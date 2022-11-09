// 
// Decompiled by Procyon v0.6.0
// 

package w30;

import wa0.i;
import com.reddit.domain.repository.ModToolsRepository;
import com.reddit.data.snoovatar.mapper.OutfitMapper;
import v60.x;
import v60.w;
import av.k;
import com.reddit.screen.predictions.changeresult.PredictionChangeResultPresenter;
import com.reddit.ui.predictions.mapper.PredictionsUiMapper;
import com.reddit.screen.predictions.leaderboard.PredictorsLeaderboardPresenter;
import com.reddit.events.predictions.PredictionsAnalytics;
import m62.m;
import com.reddit.session.q;
import com.reddit.screens.coinupsell.CoinsUpsellDelegate;
import com.reddit.domain.coins.usecase.FetchCoinsDataUseCase;
import com.reddit.screens.comment.edit.CommentEditPresenter;
import com.reddit.events.comment.CommentAnalytics;
import com.reddit.comment.domain.usecase.UploadImageInCommentUseCase;
import com.reddit.comment.domain.usecase.EditCommentUseCase;
import ge0.l;
import ge0.a0;
import com.reddit.ui.onboarding.topic.TopicsRecommendationMapper;
import xs1.e;
import com.reddit.ui.survey.InitialFeedScrollTriggerDelegate;
import ot2.c;
import tt2.b;
import org.matrix.android.sdk.internal.session.room.accountdata.a;
import ot2.j;
import ot2.h;
import org.matrix.android.sdk.internal.database.RoomSessionDatabase;
import javax.inject.Provider;

public final class d implements af2.d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    
    public static d a(final Provider provider, final Provider provider2, final Provider provider3, final Provider provider4, final Provider provider5, final Provider provider6) {
        return new d(provider, provider2, provider3, provider4, provider5, provider6, 6);
    }
    
    public static d b(final Provider provider, final Provider provider2, final Provider provider3, final Provider provider4, final Provider provider5, final Provider provider6) {
        return new d(provider, provider2, provider3, provider4, provider5, provider6, 8);
    }
    
    public static d c(final Provider provider, final Provider provider2, final v40.d d, final Provider provider3, final Provider provider4, final Provider provider5) {
        return new d(provider, provider2, (Provider)d, provider3, provider4, provider5, 9);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new c((RoomSessionDatabase)this.b.get(), (h)this.c.get(), (gt2.d)this.d.get(), (j)this.e.get(), (a)this.f.get(), (b)this.g.get());
            }
            case 11: {
                return new InitialFeedScrollTriggerDelegate((if0.a)this.b.get(), (hf0.b)this.c.get(), (ez1.b)this.d.get(), (pj0.a)this.e.get(), (bt0.a)this.f.get(), (ub0.a)this.g.get());
            }
            case 10: {
                return new e((xs1.d)this.b.get(), (xs1.b)this.c.get(), (r20.a)this.d.get(), (r20.c)this.e.get(), (jj0.b)this.f.get(), (q20.b)this.g.get());
            }
            case 9: {
                return new us1.d((bx.j)this.b.get(), (TopicsRecommendationMapper)this.c.get(), (us1.e)this.d.get(), (a0)this.e.get(), (l)this.f.get(), (f52.a)this.g.get());
            }
            case 8: {
                return new ls1.c((zg2.a)this.b.get(), (ub1.b)this.c.get(), (rc0.d)this.d.get(), (zd0.a)this.e.get(), (za0.a)this.f.get(), (rr0.a)this.g.get());
            }
            case 7: {
                return new CommentEditPresenter((z81.d)this.b.get(), (EditCommentUseCase)this.c.get(), (UploadImageInCommentUseCase)this.d.get(), (r20.c)this.e.get(), (z81.a)this.f.get(), (CommentAnalytics)this.g.get());
            }
            case 6: {
                return new CoinsUpsellDelegate((ls1.a)this.b.get(), (qr0.b)this.c.get(), (r20.a)this.d.get(), (r20.c)this.e.get(), (rr0.a)this.f.get(), (FetchCoinsDataUseCase)this.g.get());
            }
            case 5: {
                return new bq1.d((q)this.b.get(), (bq1.b)this.c.get(), (bq1.e)this.d.get(), (bq1.c)this.e.get(), (v00.a)this.f.get(), (bq1.a)this.g.get());
            }
            case 4: {
                return new PredictorsLeaderboardPresenter((zj1.c)this.b.get(), (zj1.a)this.c.get(), (m)this.d.get(), (xd0.c)this.e.get(), (wd0.a)this.f.get(), (PredictionsAnalytics)this.g.get());
            }
            case 3: {
                return new PredictionChangeResultPresenter((wj1.c)this.b.get(), (wj1.a)this.c.get(), (q20.c)this.d.get(), (PredictionsUiMapper)this.e.get(), (xd0.c)this.f.get(), (PredictionsAnalytics)this.g.get());
            }
            case 2: {
                return new d01.a((d01.c)this.b.get(), (ei0.a)this.c.get(), (cw.b)this.d.get(), (k)this.e.get(), (gv.a)this.f.get(), (iv.a)this.g.get());
            }
            case 1: {
                return new v60.j((v60.a)this.b.get(), (w)this.c.get(), (pe0.a)this.d.get(), (x)this.e.get(), (OutfitMapper)this.f.get(), (ay1.a)this.g.get());
            }
            case 0: {
                return new w30.c((ModToolsRepository)this.b.get(), (ge0.b)this.c.get(), (ge0.e)this.d.get(), (ra0.a)this.e.get(), (i)this.f.get(), (r20.a)this.g.get());
            }
        }
    }
}
