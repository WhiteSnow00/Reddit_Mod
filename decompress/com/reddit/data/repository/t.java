// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import ff2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import z50.u0;
import com.reddit.domain.model.FileUploadLease;
import io.reactivex.plugins.RxJavaPlugins;
import com.reddit.domain.modtools.ModToolsCommunityInviteType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import com.reddit.domain.model.mod.SubredditRulesResponse;
import com.reddit.domain.model.mod.MutedUsersResponse;
import com.reddit.domain.model.mod.BannedUsersResponse;
import com.reddit.domain.model.mod.ApprovedSubmittersResponse;
import com.reddit.domain.model.mod.ModeratorsResponse;
import kotlin.Pair;
import com.reddit.domain.model.mod.ModToolsUserModel;
import java.util.Map;
import java.util.HashMap;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import com.reddit.domain.modtools.BanInfoModel;
import com.reddit.domain.modtools.ModToolsActionType;
import rg2.p;
import yd.b;
import lg2.c;
import z50.r;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import java.util.ArrayList;
import com.reddit.domain.repository.ModToolsRepository$BulkAction;
import n20.d;
import com.reddit.data.remote.RemoteModToolsDataSource$a;
import okhttp3.ResponseBody;
import nu2.w;
import ff2.c0;
import com.reddit.domain.repository.ModToolsRepository$ReportType;
import javax.inject.Inject;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import sg2.e;
import com.squareup.moshi.y;
import java.util.List;
import com.squareup.moshi.JsonAdapter;
import com.reddit.session.o;
import v40.h0;
import com.reddit.data.remote.RemoteModToolsDataSource;
import n20.a;
import com.reddit.domain.repository.ModToolsRepository;

public final class t implements ModToolsRepository
{
    public final n20.a a;
    public final RemoteModToolsDataSource b;
    public final h0 c;
    public final o d;
    public final o01.a e;
    public final l01.a f;
    public final JsonAdapter<List<String>> g;
    
    @Inject
    public t(final n20.a a, final RemoteModToolsDataSource b, final h0 c, final o d, final y y, final o01.a e, final l01.a f) {
        sg2.e.f((Object)a, "backgroundThread");
        sg2.e.f((Object)b, "remote");
        sg2.e.f((Object)c, "local");
        sg2.e.f((Object)d, "sessionManager");
        sg2.e.f((Object)y, "moshi");
        sg2.e.f((Object)e, "modFeatures");
        sg2.e.f((Object)f, "modActionsDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (JsonAdapter<List<String>>)y.b((Type)a0.d((Class)List.class, new Type[] { String.class }));
    }
    
    public final c0<w<ResponseBody>> a(final String s, String s2, final ModToolsRepository$ReportType modToolsRepository$ReportType, final Long n) {
        sg2.e.f((Object)s, "thingId");
        sg2.e.f((Object)s2, "specificReason");
        sg2.e.f((Object)modToolsRepository$ReportType, "type");
        final int n2 = t.a.b[((Enum)modToolsRepository$ReportType).ordinal()];
        String s6;
        if (n2 != 1) {
            if (n2 == 2) {
                final String s3 = s2;
                s2 = null;
                final String s5;
                final String s4 = s5 = s2;
                return nn0.a.V(RemoteModToolsDataSource$a.a(this.b, s, s2, (String)null, s4, s3, s5, n, 4), (d)this.a);
            }
            if (n2 == 3) {
                final String s5 = s2;
                s2 = "other";
                final String s3;
                final String s4 = s3 = null;
                return nn0.a.V(RemoteModToolsDataSource$a.a(this.b, s, s2, (String)null, s4, s3, s5, n, 4), (d)this.a);
            }
            s2 = (s6 = null);
        }
        else {
            s6 = "site_reason_selected";
        }
        final String s7 = s2;
        s2 = s6;
        String s5;
        String s3 = s5 = null;
        final String s4 = s7;
        return nn0.a.V(RemoteModToolsDataSource$a.a(this.b, s, s2, (String)null, s4, s3, s5, n, 4), (d)this.a);
    }
    
    public final c0 b(final ModToolsRepository$BulkAction modToolsRepository$BulkAction, final ArrayList list) {
        sg2.e.f((Object)modToolsRepository$BulkAction, "action");
        final StringBuilder sb = new StringBuilder();
        sb.append("{\"ids\":");
        sb.append(this.g.toJson((Object)list));
        sb.append('}');
        final RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse("application/json"), sb.toString());
        final int n = t.a.a[((Enum)modToolsRepository$BulkAction).ordinal()];
        c0 c0;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    c0 = nn0.a.V(this.b.bulkModActions(modToolsRepository$BulkAction.getValue(), create), (d)this.a).w((kf2.o)new r(3));
                    sg2.e.e((Object)c0, "{\n        remote.bulkMod\u2026         .map { }\n      }");
                }
                else {
                    c0 = yd.b.b0((p)new RedditModToolsRepository$bulkModAction$3(this, (List)list, (c)null));
                }
            }
            else {
                c0 = yd.b.b0((p)new RedditModToolsRepository$bulkModAction$2(this, (List)list, (c)null));
            }
        }
        else {
            c0 = yd.b.b0((p)new RedditModToolsRepository$bulkModAction$1(this, (List)list, (c)null));
        }
        return nn0.a.V((c0)c0, (d)this.a);
    }
    
    public final c0<w<ResponseBody>> c(final String s, final String s2, final String s3) {
        al0.b.q(s, "subredditName", s2, "userId", s3, "username");
        return nn0.a.V(this.b.unmuteUser(s, s2, s3, ModToolsActionType.TYPE_MUTE), (d)this.a);
    }
    
    public final c0<PostResponseWithErrors> d(final String s, final BanInfoModel banInfoModel) {
        sg2.e.f((Object)s, "subredditName");
        final HashMap hashMap = new HashMap();
        if (banInfoModel.getBanContext() != null) {
            final String banContext = banInfoModel.getBanContext();
            sg2.e.c((Object)banContext);
            hashMap.put("ban_context", banContext);
        }
        hashMap.put("type", ModToolsActionType.TYPE_BAN.getAction());
        hashMap.put("name", banInfoModel.getUsername());
        hashMap.put("ban_reason", banInfoModel.getBanReason());
        hashMap.put("note", banInfoModel.getModNote());
        hashMap.put("ban_message", banInfoModel.getBanMessage());
        hashMap.put("api_type", "json");
        return nn0.a.V(this.b.banUser(s, (Map)hashMap, banInfoModel.getDuration()), (d)this.a);
    }
    
    public final c0<w<ResponseBody>> e(final String s, final ModToolsUserModel modToolsUserModel) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)modToolsUserModel, "user");
        return nn0.a.V(this.b.removeModerator(s, kotlin.collections.c.X0(new Pair[] { new Pair((Object)"id", (Object)modToolsUserModel.getId()), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR.getAction()) })), (d)this.a);
    }
    
    public final c0<PostResponseWithErrors> f(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.addApprovedSubmitter(s, s2, ModToolsActionType.TYPE_CONTRIBUTOR, "json"), (d)this.a);
    }
    
    public final c0<w<ResponseBody>> g(final String s, final ModToolsUserModel modToolsUserModel) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)modToolsUserModel, "user");
        return nn0.a.V(this.b.unbanUser(s, modToolsUserModel.getId(), (String)null, ModToolsActionType.TYPE_BAN), (d)this.a);
    }
    
    public final c0<ModeratorsResponse> getAllModerators(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.getAllModerators(s, s2), (d)this.a);
    }
    
    public final c0<ApprovedSubmittersResponse> getApprovedSubmitters(final String s, final String s2) {
        sg2.e.f((Object)s, "subreddditName");
        return nn0.a.V(this.b.getApprovedSubmitters(s, s2), (d)this.a);
    }
    
    public final c0<BannedUsersResponse> getBannedUsers(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.getBannedUsers(s, s2), (d)this.a);
    }
    
    public final c0<ModeratorsResponse> getEditableModerators(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.getEditableModerators(s, s2), (d)this.a);
    }
    
    public final c0<MutedUsersResponse> getMutedUsers(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.getMutedUsers(s, s2), (d)this.a);
    }
    
    public final c0<SubredditRulesResponse> getSubredditRules(final String s) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.getSubredditRules(s), (d)this.a);
    }
    
    public final Object h(final String s, final c<? super j> c) {
        final Object declineCommunityInvite = this.b.declineCommunityInvite(s, "subscriber_invite", a81.e.r("api_type", "json"), (c)c);
        if (declineCommunityInvite == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return declineCommunityInvite;
        }
        return j.a;
    }
    
    public final c0<PostResponseWithErrors> i(final String s, final String s2, final String s3) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.inviteModerator(s, kotlin.collections.c.X0(new Pair[] { new Pair((Object)"name", (Object)s2), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR_INVITE.getAction()), new Pair((Object)"permissions", (Object)s3), new Pair((Object)"api_type", (Object)"json") })), (d)this.a);
    }
    
    public final Object inviteToCommunity(final String s, final String s2, final ModToolsCommunityInviteType modToolsCommunityInviteType, final String s3, final String s4, final c<? super PostResponseWithErrors> c) {
        return this.b.inviteToCommunity(s, s2, modToolsCommunityInviteType, s4, s3, (c)c);
    }
    
    public final c0<w<ResponseBody>> j(final String s, final String s2) {
        sg2.e.f((Object)s, "subreddit");
        sg2.e.f((Object)s2, "iconUrl");
        return nn0.a.V(this.b.attachCommunityIcon(s, s2), (d)this.a);
    }
    
    public final Object k(final String s, final c<? super j> c) {
        final Object declineCommunityInvite = this.b.declineCommunityInvite(s, "moderator_invite", a81.e.r("api_type", "json"), (c)c);
        if (declineCommunityInvite == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return declineCommunityInvite;
        }
        return j.a;
    }
    
    public final c0<PostResponseWithErrors> l(final String s, final String s2, final String s3) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.editModerator(s, kotlin.collections.c.X0(new Pair[] { new Pair((Object)"name", (Object)s2), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR.getAction()), new Pair((Object)"permissions", (Object)s3), new Pair((Object)"api_type", (Object)"json") })), (d)this.a);
    }
    
    public final c0<w<ResponseBody>> m(final String s, final ModToolsUserModel modToolsUserModel) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)modToolsUserModel, "user");
        return nn0.a.V(this.b.unmuteUser(s, modToolsUserModel.getId(), modToolsUserModel.getUsername(), ModToolsActionType.TYPE_MUTE), (d)this.a);
    }
    
    public final c0<w<ResponseBody>> n(final String s, final ModToolsUserModel modToolsUserModel) {
        sg2.e.f((Object)s, "subreddditName");
        sg2.e.f((Object)modToolsUserModel, "user");
        return nn0.a.V(this.b.removeApprovedSubmitter(s, modToolsUserModel.getId(), ModToolsActionType.TYPE_CONTRIBUTOR), (d)this.a);
    }
    
    public final c0<PostResponseWithErrors> o(final String s) {
        sg2.e.f((Object)s, "subredditName");
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly(new uf2.c<Object>(nn0.a.V(this.b.acceptModInvite(s, bg.d.p0(new Pair((Object)"api_type", (Object)"json"))), (d)this.a), new q(2, this, s)));
        sg2.e.e((Object)onAssembly, "remote.acceptModInvite(s\u2026ername)\n        }\n      }");
        return (c0<PostResponseWithErrors>)onAssembly;
    }
    
    public final c0<FileUploadLease> p(final String s, final String s2, final String s3) {
        sg2.e.f((Object)s, "subreddit");
        sg2.e.f((Object)s3, "fileMimeType");
        return nn0.a.V(this.b.leaseCommunityIconUpload(s, s2, s3, "communityIcon"), (d)this.a);
    }
    
    public final c0<PostResponseWithErrors> q(final String s, final String s2, final String s3) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.muteUser(s, s2, s3, ModToolsActionType.TYPE_MUTE, "json"), (d)this.a);
    }
    
    public final c0<ApprovedSubmittersResponse> r(final String s, final String s2) {
        sg2.e.f((Object)s, "subreddditName");
        sg2.e.f((Object)s2, "username");
        return nn0.a.V(this.b.searchApprovedSubmitters(s, s2), (d)this.a);
    }
    
    public final c0<w<ResponseBody>> s(final String s) {
        sg2.e.f((Object)s, "subredditName");
        return nn0.a.V(this.b.declineModInvite(s, bg.d.p0(new Pair((Object)"api_type", (Object)"json"))), (d)this.a);
    }
    
    public final c0<ModeratorsResponse> searchAllModerators(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)s2, "username");
        final c0 searchAllModerators = this.b.searchAllModerators(s, s2);
        final u0 u0 = new u0((Object)this, 0, (Object)s, (Object)s2);
        searchAllModerators.getClass();
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly((c0<Object>)new SingleFlatMap((g0)searchAllModerators, (kf2.o)u0));
        sg2.e.e((Object)onAssembly, "remote.searchAllModerato\u2026(Single.just(it))\n      }");
        final c0 v = this.c.b(s, s2).v((c0)onAssembly);
        sg2.e.e((Object)v, "local.getModPermissions(\u2026   .switchIfEmpty(remote)");
        return nn0.a.V(v, (d)this.a);
    }
    
    public final c0<BannedUsersResponse> searchBannedUser(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)s2, "username");
        return nn0.a.V(this.b.searchBannedUser(s, s2), (d)this.a);
    }
    
    public final c0<ModeratorsResponse> searchEditableModerators(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)s2, "username");
        return nn0.a.V(this.b.searchEditableModerators(s, s2), (d)this.a);
    }
    
    public final c0<MutedUsersResponse> searchMutedUser(final String s, final String s2) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)s2, "username");
        return nn0.a.V(this.b.searchMutedUser(s, s2), (d)this.a);
    }
    
    public final c0 t(final String s) {
        sg2.e.f((Object)s, "username");
        return nn0.a.V(RemoteModToolsDataSource$a.a(this.b, (String)null, "site_reason_selected", s, "self harm", (String)null, (String)null, (Long)null, 113), (d)this.a);
    }
    
    public final c0<w<ResponseBody>> unbanUser(final String s, final String s2, final String s3, final ModToolsActionType modToolsActionType) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)s2, "userId");
        sg2.e.f((Object)s3, "username");
        sg2.e.f((Object)modToolsActionType, "type");
        return nn0.a.V(this.b.unbanUser(s, s2, s3, modToolsActionType), (d)this.a);
    }
}
