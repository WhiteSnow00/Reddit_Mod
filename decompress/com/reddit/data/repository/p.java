// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import af2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import com.reddit.domain.model.FileUploadLease;
import io.reactivex.plugins.RxJavaPlugins;
import b60.b0;
import com.reddit.domain.modtools.ModToolsCommunityInviteType;
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
import ah0.b;
import gg2.c;
import ff2.o;
import b60.t;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import java.util.ArrayList;
import q20.d;
import com.reddit.data.remote.RemoteModToolsDataSource$a;
import okhttp3.ResponseBody;
import ku2.w;
import af2.c0;
import javax.inject.Inject;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ng2.e;
import com.squareup.moshi.y;
import java.util.List;
import com.squareup.moshi.JsonAdapter;
import com.reddit.session.n;
import x40.f0;
import com.reddit.data.remote.RemoteModToolsDataSource;
import q20.a;
import com.reddit.domain.repository.ModToolsRepository;

public final class p implements ModToolsRepository
{
    public final a a;
    public final RemoteModToolsDataSource b;
    public final f0 c;
    public final n d;
    public final s01.a e;
    public final p01.a f;
    public final JsonAdapter<List<String>> g;
    
    @Inject
    public p(final a a, final RemoteModToolsDataSource b, final f0 c, final n d, final y y, final s01.a e, final p01.a f) {
        ng2.e.f((Object)a, "backgroundThread");
        ng2.e.f((Object)b, "remote");
        ng2.e.f((Object)c, "local");
        ng2.e.f((Object)d, "sessionManager");
        ng2.e.f((Object)y, "moshi");
        ng2.e.f((Object)e, "modFeatures");
        ng2.e.f((Object)f, "modActionsDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (JsonAdapter<List<String>>)y.b((Type)a0.d((Class)List.class, new Type[] { String.class }));
    }
    
    @Override
    public final c0<w<ResponseBody>> a(final String s, String s2, final ReportType reportType, final Long n) {
        ng2.e.f((Object)s, "thingId");
        ng2.e.f((Object)s2, "specificReason");
        ng2.e.f((Object)reportType, "type");
        final int n2 = p.p$a.b[reportType.ordinal()];
        String s6;
        if (n2 != 1) {
            if (n2 == 2) {
                final String s3 = s2;
                s2 = null;
                final String s5;
                final String s4 = s5 = null;
                return px1.a.K0(RemoteModToolsDataSource$a.a(this.b, s, s2, (String)null, s4, s3, s5, n, 4), (d)this.a);
            }
            if (n2 == 3) {
                final String s5 = s2;
                s2 = "other";
                final String s4 = null;
                final String s3 = null;
                return px1.a.K0(RemoteModToolsDataSource$a.a(this.b, s, s2, (String)null, s4, s3, s5, n, 4), (d)this.a);
            }
            s2 = null;
            s6 = null;
        }
        else {
            s6 = "site_reason_selected";
        }
        final String s7 = s6;
        final String s3 = null;
        String s5 = null;
        final String s4 = s2;
        s2 = s7;
        return px1.a.K0(RemoteModToolsDataSource$a.a(this.b, s, s2, (String)null, s4, s3, s5, n, 4), (d)this.a);
    }
    
    @Override
    public final c0 b(final BulkAction bulkAction, final ArrayList list) {
        ng2.e.f((Object)bulkAction, "action");
        final StringBuilder sb = new StringBuilder();
        sb.append("{\"ids\":");
        sb.append(this.g.toJson((Object)list));
        sb.append('}');
        final RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse("application/json"), sb.toString());
        final int n = p.p$a.a[bulkAction.ordinal()];
        c0 c0;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    c0 = px1.a.K0(this.b.bulkModActions(bulkAction.getValue(), create), (d)this.a).w((o)new t(8));
                    ng2.e.e((Object)c0, "{\n        remote.bulkMod\u2026         .map { }\n      }");
                }
                else {
                    c0 = ah0.b.m1((mg2.p)new RedditModToolsRepository$bulkModAction$3(this, (List)list, (c)null));
                }
            }
            else {
                c0 = ah0.b.m1((mg2.p)new RedditModToolsRepository$bulkModAction$2(this, (List)list, (c)null));
            }
        }
        else {
            c0 = ah0.b.m1((mg2.p)new RedditModToolsRepository$bulkModAction$1(this, (List)list, (c)null));
        }
        return px1.a.K0((c0)c0, (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> c(final String s, final String s2, final String s3) {
        b.w(s, "subredditName", s2, "userId", s3, "username");
        return px1.a.K0(this.b.unmuteUser(s, s2, s3, ModToolsActionType.TYPE_MUTE), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> d(final String s, final BanInfoModel banInfoModel) {
        ng2.e.f((Object)s, "subredditName");
        final HashMap hashMap = new HashMap();
        if (banInfoModel.getBanContext() != null) {
            final String banContext = banInfoModel.getBanContext();
            ng2.e.c((Object)banContext);
            hashMap.put("ban_context", banContext);
        }
        hashMap.put("type", ModToolsActionType.TYPE_BAN.getAction());
        hashMap.put("name", banInfoModel.getUsername());
        hashMap.put("ban_reason", banInfoModel.getBanReason());
        hashMap.put("note", banInfoModel.getModNote());
        hashMap.put("ban_message", banInfoModel.getBanMessage());
        hashMap.put("api_type", "json");
        return px1.a.K0(this.b.banUser(s, (Map)hashMap, banInfoModel.getDuration()), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> e(final String s, final ModToolsUserModel modToolsUserModel) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)modToolsUserModel, "user");
        return px1.a.K0(this.b.removeModerator(s, kotlin.collections.c.w4(new Pair[] { new Pair((Object)"id", (Object)modToolsUserModel.getId()), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR.getAction()) })), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> f(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.addApprovedSubmitter(s, s2, ModToolsActionType.TYPE_CONTRIBUTOR, "json"), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> g(final String s, final ModToolsUserModel modToolsUserModel) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)modToolsUserModel, "user");
        return px1.a.K0(this.b.unbanUser(s, modToolsUserModel.getId(), (String)null, ModToolsActionType.TYPE_BAN), (d)this.a);
    }
    
    @Override
    public final c0<ModeratorsResponse> getAllModerators(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.getAllModerators(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<ApprovedSubmittersResponse> getApprovedSubmitters(final String s, final String s2) {
        ng2.e.f((Object)s, "subreddditName");
        return px1.a.K0(this.b.getApprovedSubmitters(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<BannedUsersResponse> getBannedUsers(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.getBannedUsers(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<ModeratorsResponse> getEditableModerators(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.getEditableModerators(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<MutedUsersResponse> getMutedUsers(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.getMutedUsers(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<SubredditRulesResponse> getSubredditRules(final String s) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.getSubredditRules(s), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> h(final String s, final String s2, final String s3) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.inviteModerator(s, kotlin.collections.c.w4(new Pair[] { new Pair((Object)"name", (Object)s2), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR_INVITE.getAction()), new Pair((Object)"permissions", (Object)s3), new Pair((Object)"api_type", (Object)"json") })), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> i(final String s, final String s2) {
        ng2.e.f((Object)s, "subreddit");
        ng2.e.f((Object)s2, "iconUrl");
        return px1.a.K0(this.b.attachCommunityIcon(s, s2), (d)this.a);
    }
    
    @Override
    public final Object inviteToCommunity(final String s, final String s2, final ModToolsCommunityInviteType modToolsCommunityInviteType, final String s3, final String s4, final c<? super PostResponseWithErrors> c) {
        return this.b.inviteToCommunity(s, s2, modToolsCommunityInviteType, s4, s3, (c)c);
    }
    
    @Override
    public final c0<PostResponseWithErrors> j(final String s, final String s2, final String s3) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.editModerator(s, kotlin.collections.c.w4(new Pair[] { new Pair((Object)"name", (Object)s2), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR.getAction()), new Pair((Object)"permissions", (Object)s3), new Pair((Object)"api_type", (Object)"json") })), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> k(final String s, final ModToolsUserModel modToolsUserModel) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)modToolsUserModel, "user");
        return px1.a.K0(this.b.unmuteUser(s, modToolsUserModel.getId(), modToolsUserModel.getUsername(), ModToolsActionType.TYPE_MUTE), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> l(final String s, final ModToolsUserModel modToolsUserModel) {
        ng2.e.f((Object)s, "subreddditName");
        ng2.e.f((Object)modToolsUserModel, "user");
        return px1.a.K0(this.b.removeApprovedSubmitter(s, modToolsUserModel.getId(), ModToolsActionType.TYPE_CONTRIBUTOR), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> m(final String s) {
        ng2.e.f((Object)s, "subredditName");
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new pf2.c(px1.a.K0(this.b.acceptModInvite(s, cg.d.r3(new Pair((Object)"api_type", (Object)"json"))), (d)this.a), new b0(2, (Object)this, (Object)s)));
        ng2.e.e((Object)onAssembly, "remote.acceptModInvite(s\u2026ername)\n        }\n      }");
        return onAssembly;
    }
    
    @Override
    public final c0<FileUploadLease> n(final String s, final String s2, final String s3) {
        ng2.e.f((Object)s, "subreddit");
        ng2.e.f((Object)s3, "fileMimeType");
        return px1.a.K0(this.b.leaseCommunityIconUpload(s, s2, s3, "communityIcon"), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> o(final String s, final String s2, final String s3) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.muteUser(s, s2, s3, ModToolsActionType.TYPE_MUTE, "json"), (d)this.a);
    }
    
    @Override
    public final Object p(final String s, final c<? super j> c) {
        final Object declineCommunityInvite = this.b.declineCommunityInvite(s, "moderator_invite", aq2.a.t("api_type", "json"), (c)c);
        if (declineCommunityInvite == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return declineCommunityInvite;
        }
        return j.a;
    }
    
    @Override
    public final Object q(final String s, final c<? super j> c) {
        final Object declineCommunityInvite = this.b.declineCommunityInvite(s, "subscriber_invite", aq2.a.t("api_type", "json"), (c)c);
        if (declineCommunityInvite == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return declineCommunityInvite;
        }
        return j.a;
    }
    
    @Override
    public final c0<ApprovedSubmittersResponse> r(final String s, final String s2) {
        ng2.e.f((Object)s, "subreddditName");
        ng2.e.f((Object)s2, "username");
        return px1.a.K0(this.b.searchApprovedSubmitters(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> s(final String s) {
        ng2.e.f((Object)s, "subredditName");
        return px1.a.K0(this.b.declineModInvite(s, cg.d.r3(new Pair((Object)"api_type", (Object)"json"))), (d)this.a);
    }
    
    @Override
    public final c0<ModeratorsResponse> searchAllModerators(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)s2, "username");
        final c0 searchAllModerators = this.b.searchAllModerators(s, s2);
        final nw.d d = new nw.d((Object)this, 5, (Object)s, (Object)s2);
        searchAllModerators.getClass();
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)searchAllModerators, (o)d));
        ng2.e.e((Object)onAssembly, "remote.searchAllModerato\u2026(Single.just(it))\n      }");
        final c0 w = this.c.b(s, s2).w(onAssembly);
        ng2.e.e((Object)w, "local.getModPermissions(\u2026   .switchIfEmpty(remote)");
        return px1.a.K0((c0)w, (d)this.a);
    }
    
    @Override
    public final c0<BannedUsersResponse> searchBannedUser(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)s2, "username");
        return px1.a.K0(this.b.searchBannedUser(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<ModeratorsResponse> searchEditableModerators(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)s2, "username");
        return px1.a.K0(this.b.searchEditableModerators(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<MutedUsersResponse> searchMutedUser(final String s, final String s2) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)s2, "username");
        return px1.a.K0(this.b.searchMutedUser(s, s2), (d)this.a);
    }
    
    @Override
    public final c0 t(final String s) {
        ng2.e.f((Object)s, "username");
        return px1.a.K0(RemoteModToolsDataSource$a.a(this.b, (String)null, "site_reason_selected", s, "self harm", (String)null, (String)null, (Long)null, 113), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> unbanUser(final String s, final String s2, final String s3, final ModToolsActionType modToolsActionType) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)s2, "userId");
        ng2.e.f((Object)s3, "username");
        ng2.e.f((Object)modToolsActionType, "type");
        return px1.a.K0(this.b.unbanUser(s, s2, s3, modToolsActionType), (d)this.a);
    }
}
