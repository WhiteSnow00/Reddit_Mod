// 
// Decompiled by Procyon v0.6.0
// 

package m72;

import org.matrix.android.sdk.api.auth.data.Credentials;
import xd0.j;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.data.remote.graphql.RemoteGqlVaultDataSource;
import org.matrix.android.sdk.internal.auth.db.AuthDatabase$a;
import org.matrix.android.sdk.internal.auth.db.AuthDatabase;
import android.content.Context;
import jq2.q;
import jq2.p;
import org.matrix.android.sdk.internal.session.account.AccountAPI;
import ng2.e;
import org.matrix.android.sdk.internal.session.call.VoipApi;
import org.matrix.android.sdk.internal.session.call.TurnServerDataSource;
import org.matrix.android.sdk.internal.session.filter.FilterApi;
import yq2.c;
import ur2.f;
import org.matrix.android.sdk.internal.session.user.accountdata.AccountDataAPI;
import ku2.x;
import javax.inject.Provider;
import org.matrix.android.sdk.internal.database.RoomSessionDatabase;
import zd.b;
import ui.a;
import ne2.d;

public final class g implements d
{
    public final int a;
    public final Object b;
    
    public g(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                final ji.d b = ((a)this.b).b;
                zd.b.q(b);
                return b;
            }
            case 21: {
                return new gt2.b((RoomSessionDatabase)((Provider)this.b).get());
            }
            case 20: {
                return d.e((x)((Provider)this.b).get(), "retrofit", (Class)AccountDataAPI.class, "retrofit.create(AccountDataAPI::class.java)");
            }
            case 19: {
                return new ps2.a((ps2.b)((Provider)this.b).get());
            }
            case 18: {
                return new f((String)((Provider)this.b).get());
            }
            case 17: {
                return new gr2.a((gr2.b)((Provider)this.b).get());
            }
            case 16: {
                return new dr2.a((org.matrix.android.sdk.internal.session.integrationmanager.a)((Provider)this.b).get());
            }
            case 15: {
                return new c((RoomSessionDatabase)((Provider)this.b).get());
            }
            case 14: {
                return d.e((x)((Provider)this.b).get(), "retrofit", (Class)FilterApi.class, "retrofit.create(FilterApi::class.java)");
            }
            case 13: {
                return new TurnServerDataSource((qq2.g)((Provider)this.b).get());
            }
            case 12: {
                return d.e((x)((Provider)this.b).get(), "retrofit", (Class)VoipApi.class, "retrofit.create(VoipApi::class.java)");
            }
            case 11: {
                final bq2.c c = (bq2.c)((Provider)this.b).get();
                e.f((Object)c, "roomConfiguration");
                return new pq2.c(c);
            }
            case 10: {
                return d.e((x)((Provider)this.b).get(), "retrofit", (Class)AccountAPI.class, "retrofit.create(AccountAPI::class.java)");
            }
            case 9: {
                final bq2.e e = (bq2.e)((Provider)this.b).get();
                ng2.e.f((Object)e, "sessionRoomNameConfigurationFactory");
                final StringBuilder t = a.t("matrix_session_");
                t.append(e.a);
                return new bq2.c(t.toString());
            }
            case 8: {
                final ln2.a a = (ln2.a)((Provider)this.b).get();
                e.f((Object)a, "sessionParams");
                final Credentials a2 = a.a;
                zd.b.s(a2);
                return a2;
            }
            case 7: {
                return new q((p)((Provider)this.b).get());
            }
            case 6: {
                return new iq2.a((iq2.b)((Provider)this.b).get());
            }
            case 5: {
                return new bq2.d((RoomSessionDatabase)((Provider)this.b).get());
            }
            case 4: {
                final Context context = (Context)((Provider)this.b).get();
                e.f((Object)context, "context");
                final Object m = AuthDatabase.m;
                final xp2.f t2 = AuthDatabase$a.a(context).t();
                zd.b.s(t2);
                return t2;
            }
            case 3: {
                return new RemoteGqlVaultDataSource((l82.b)((Provider)this.b).get());
            }
            case 2: {
                return new d82.a((com.reddit.vault.c)((Provider)this.b).get());
            }
            case 1: {
                final BaseScreen baseScreen = (BaseScreen)((Provider)this.b).get();
                e.f((Object)baseScreen, "screen");
                return new v72.a(baseScreen);
            }
            case 0: {
                return new m72.f((j)((Provider)this.b).get());
            }
        }
    }
}
