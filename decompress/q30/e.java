// 
// Decompiled by Procyon v0.6.0
// 

package q30;

import java.util.concurrent.Executor;
import okhttp3.Call$Factory;
import okhttp3.OkHttpClient;
import oa0.i;
import com.reddit.domain.repository.ModToolsRepository;
import com.reddit.domain.coins.usecase.UpdateCoinsBalanceUseCase;
import com.apollographql.apollo.api.internal.Optional;
import okhttp3.HttpUrl;
import com.apollographql.apollo.a$a;
import android.net.Uri;
import okhttp3.OkHttpClient$Builder;
import okhttp3.Interceptor;
import ff0.r1;
import v12.l;
import com.reddit.notification.common.NotificationManagerFacade;
import com.reddit.screen.onboarding.lowsignal.OnboardingLowSignalBottomsheetPresenter;
import va0.s;
import com.reddit.screen.snoovatar.builder.categories.section.BuilderSectionPresenter;
import com.reddit.events.snoovatar.SnoovatarAnalytics;
import com.reddit.session.o;
import com.reddit.session.Session;
import com.reddit.screens.awards.purchase.GiveAwardCoinsPurchasePresenter;
import com.reddit.domain.coins.usecase.FetchCoinsDataUseCase;
import com.reddit.events.gold.GoldAnalytics;
import oa0.k;
import m20.c;
import com.reddit.screens.chat.modals.chatthemes.ChatThemesSheetPresenter;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import oa0.m;
import com.reddit.vault.feature.vault.payment.loading.PaymentLoadingPresenter;
import va0.e0;
import ab2.g;
import y82.h;
import pa2.a;
import org.matrix.android.sdk.internal.session.room.membership.DefaultLoadRoomMembersTask;
import xr2.f;
import ls2.b;
import ws2.j;
import org.matrix.android.sdk.internal.database.RoomSessionDatabase;
import org.matrix.android.sdk.internal.session.room.RoomAPI;
import javax.inject.Provider;
import se2.d;

public final class e implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new DefaultLoadRoomMembersTask((RoomAPI)this.b.get(), (RoomSessionDatabase)this.c.get(), (j)this.d.get(), (b)this.e.get(), (f)this.f.get(), (mq2.d)this.g.get());
            }
            case 12: {
                return new PaymentLoadingPresenter((a)this.b.get(), (pa2.d)this.c.get(), (h)this.d.get(), (g)this.e.get(), (i82.a)this.f.get(), (e0)this.g.get());
            }
            case 11: {
                return new ChatThemesSheetPresenter((kq1.b)this.b.get(), (rg2.a)this.c.get(), (uq1.a)this.d.get(), (m)this.e.get(), (gp1.b)this.f.get(), (ChatAnalytics)this.g.get());
            }
            case 10: {
                return new pp1.b((c)this.b.get(), (qp1.c)this.c.get(), (qp1.d)this.d.get(), (r00.a)this.e.get(), (qp1.f)this.f.get(), (k)this.g.get());
            }
            case 9: {
                return new GiveAwardCoinsPurchasePresenter((GoldAnalytics)this.b.get(), (jr0.a)this.c.get(), (FetchCoinsDataUseCase)this.d.get(), (go1.d)this.e.get(), (go1.f)this.f.get(), (go1.c)this.g.get());
            }
            case 8: {
                return new yn1.b((jr0.a)this.b.get(), (GoldAnalytics)this.c.get(), (as1.a)this.d.get(), (iz.a)this.e.get(), (Session)this.f.get(), (o)this.g.get());
            }
            case 7: {
                return new BuilderSectionPresenter((ul1.d)this.b.get(), (SnoovatarAnalytics)this.c.get(), (ul1.a)this.d.get(), (nl1.h)this.e.get(), (zl1.a)this.f.get(), (pm1.a)this.g.get());
            }
            case 6: {
                return new OnboardingLowSignalBottomsheetPresenter((bi1.b)this.b.get(), (ic0.d)this.c.get(), (s)this.d.get(), (wc0.b)this.e.get(), (m20.b)this.f.get(), (ci0.a)this.g.get());
            }
            case 5: {
                return new vg1.a((us0.c)this.b.get(), (NotificationManagerFacade)this.c.get(), (va0.b)this.d.get(), se2.c.a(this.e), (pi0.d)this.f.get(), (p51.a)this.g.get());
            }
            case 4: {
                return new ee1.k((com.reddit.screens.listing.mapper.a)this.b.get(), (zk0.a)this.c.get(), (l)this.d.get(), (m20.b)this.e.get(), (r1)this.f.get(), (va0.f)this.g.get());
            }
            case 3: {
                final Interceptor interceptor = (Interceptor)this.b.get();
                final Interceptor interceptor2 = (Interceptor)this.c.get();
                final Interceptor interceptor3 = (Interceptor)this.d.get();
                final Interceptor interceptor4 = (Interceptor)this.e.get();
                final us0.g g = (us0.g)this.f.get();
                final e41.b b = (e41.b)this.g.get();
                sg2.e.f((Object)interceptor, "realtimeOriginInterceptor");
                sg2.e.f((Object)interceptor2, "oAuthInterceptor");
                sg2.e.f((Object)interceptor3, "userAgentInterceptor");
                sg2.e.f((Object)interceptor4, "tokenValidityInterceptor");
                sg2.e.f((Object)g, "hostSettings");
                sg2.e.f((Object)b, "apolloThreadPoolExecutorProvider");
                final OkHttpClient build = new OkHttpClient$Builder().addInterceptor(interceptor).addInterceptor(interceptor2).addInterceptor(interceptor3).addInterceptor(interceptor4).build();
                final String string = Uri.parse(g.f()).buildUpon().scheme("wss").build().toString();
                sg2.e.e((Object)string, "parse(hostSettings.realt\u2026build()\n      .toString()");
                final a$a a$a = new a$a();
                final String f = g.f();
                if (f == null) {
                    throw new NullPointerException("serverUrl == null");
                }
                a$a.b = HttpUrl.parse(f);
                a$a.m = Optional.of((Object)new a8.h.a(string, build));
                if (build != null) {
                    a$a.a = (Call$Factory)build;
                    Object a;
                    if (b.b.z7()) {
                        a = b.a;
                    }
                    else {
                        a = null;
                    }
                    if (a != null) {
                        a$a.i = (Executor)a;
                    }
                    return a$a.a();
                }
                throw new NullPointerException("okHttpClient is null");
            }
            case 2: {
                return new vz0.a((vz0.c)this.b.get(), (uh0.a)this.c.get(), (yv.b)this.d.get(), (wu.l)this.e.get(), (cv.a)this.f.get(), (ev.a)this.g.get());
            }
            case 1: {
                return new com.reddit.domain.coins.usecase.a((qz.c)this.b.get(), (GoldAnalytics)this.c.get(), (UpdateCoinsBalanceUseCase)this.d.get(), (uz.a)this.e.get(), (cw0.a)this.f.get(), (sd0.a)this.g.get());
            }
            case 0: {
                return new q30.d((ModToolsRepository)this.b.get(), (xd0.b)this.c.get(), (xd0.d)this.d.get(), (ja0.a)this.e.get(), (i)this.f.get(), (n20.a)this.g.get());
            }
        }
    }
}
