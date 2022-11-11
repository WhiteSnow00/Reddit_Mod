// 
// Decompiled by Procyon v0.6.0
// 

package w82;

import androidx.room.RoomDatabase;
import com.reddit.vault.domain.RedditCanVaultBeSecuredUseCase;
import com.reddit.vault.navigation.RedditNftVaultOptionCoordinator;
import ab2.i;
import androidx.room.g;
import android.content.Context;
import br2.b;
import org.matrix.android.sdk.internal.session.pushers.DefaultUpdatePushRuleActionsTask;
import org.matrix.android.sdk.internal.session.pushers.PushRulesApi;
import org.matrix.android.sdk.internal.session.room.alias.DefaultDeleteRoomAliasTask;
import org.matrix.android.sdk.internal.session.directory.DirectoryAPI;
import eq2.c;
import org.matrix.android.sdk.internal.database.RoomSessionDatabase;
import org.matrix.android.sdk.internal.session.room.membership.joining.DefaultInviteTask;
import org.matrix.android.sdk.internal.session.room.timeline.DefaultGetEventTask;
import org.matrix.android.sdk.internal.session.room.RoomAPI;
import org.matrix.android.sdk.internal.session.space.DefaultResolveSpaceInfoTask;
import org.matrix.android.sdk.internal.session.space.SpaceApi;
import org.matrix.android.sdk.internal.session.sync.RoomSyncEphemeralTemporaryStoreFile;
import com.squareup.moshi.y;
import java.io.File;
import sg2.e;
import rg2.a;
import javax.inject.Provider;
import se2.d;

public final class f implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    
    public static f a(final Provider provider, final Provider provider2) {
        return new f(provider, provider2, 2);
    }
    
    public static ab2.f b(final a a, final wa2.a a2) {
        e.f((Object)a, "context");
        e.f((Object)a2, "cryptoVaultManager");
        return new ab2.f(a, a2);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new RoomSyncEphemeralTemporaryStoreFile((File)this.b.get(), (y)this.c.get());
            }
            case 14: {
                return new DefaultResolveSpaceInfoTask((SpaceApi)this.b.get(), (mq2.d)this.c.get());
            }
            case 13: {
                return new DefaultGetEventTask((RoomAPI)this.b.get(), (mq2.d)this.c.get());
            }
            case 12: {
                return new org.matrix.android.sdk.internal.session.room.relation.a((RoomAPI)this.b.get(), (mq2.d)this.c.get());
            }
            case 11: {
                return new DefaultInviteTask((RoomAPI)this.b.get(), (mq2.d)this.c.get());
            }
            case 10: {
                return new wr2.c((RoomSessionDatabase)this.b.get(), (c)this.c.get());
            }
            case 9: {
                return new DefaultDeleteRoomAliasTask((DirectoryAPI)this.b.get(), (mq2.d)this.c.get());
            }
            case 8: {
                return new DefaultUpdatePushRuleActionsTask((PushRulesApi)this.b.get(), (mq2.d)this.c.get());
            }
            case 7: {
                return new br2.a((br2.c)this.b.get(), (b)this.c.get());
            }
            case 6: {
                return new rq2.c((rq2.a)this.b.get(), (rq2.b)this.c.get());
            }
            case 5: {
                final eq2.b b = (eq2.b)this.b.get();
                final Context context = (Context)this.c.get();
                e.f((Object)b, "roomConfiguration");
                e.f((Object)context, "context");
                final RoomDatabase.a<RoomSessionDatabase> a = g.a(context, RoomSessionDatabase.class, b.a);
                a.h = true;
                return a.b();
            }
            case 4: {
                final Provider b2 = this.b;
                final Provider c = this.c;
                e.f((Object)b2, "fallbackNetworkCallbackStrategy");
                e.f((Object)c, "preferredNetworkCallbackStrategy");
                final Object value = c.get();
                e.e(value, "{\n                prefer\u2026ategy.get()\n            }");
                return value;
            }
            case 3: {
                return new eq2.d((File)this.b.get(), (String)this.c.get());
            }
            case 2: {
                return b((a)this.b.get(), (wa2.a)this.c.get());
            }
            case 1: {
                return new RedditNftVaultOptionCoordinator((wa2.a)this.b.get(), (i)this.c.get());
            }
            case 0: {
                return new RedditCanVaultBeSecuredUseCase((wa2.a)this.b.get(), (hw0.b)this.c.get());
            }
        }
    }
}
