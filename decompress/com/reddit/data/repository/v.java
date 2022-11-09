// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import nf2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import com.reddit.domain.model.FileUploadLease;
import io.reactivex.plugins.RxJavaPlugins;
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
import ak0.m;
import zg2.p;
import tg2.c;
import sf2.o;
import g60.u0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import java.util.ArrayList;
import r20.d;
import a4.u1;
import okhttp3.ResponseBody;
import wu2.w;
import nf2.c0;
import javax.inject.Inject;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ah2.f;
import com.squareup.moshi.y;
import java.util.List;
import com.squareup.moshi.JsonAdapter;
import com.reddit.session.q;
import c50.j0;
import com.reddit.data.remote.RemoteModToolsDataSource;
import r20.a;
import com.reddit.domain.repository.ModToolsRepository;

public final class v implements ModToolsRepository
{
    public final r20.a a;
    public final RemoteModToolsDataSource b;
    public final j0 c;
    public final q d;
    public final x01.a e;
    public final u01.a f;
    public final JsonAdapter<List<String>> g;
    
    @Inject
    public v(final r20.a a, final RemoteModToolsDataSource b, final j0 c, final q d, final y y, final x01.a e, final u01.a f) {
        ah2.f.f((Object)a, "backgroundThread");
        ah2.f.f((Object)b, "remote");
        ah2.f.f((Object)c, "local");
        ah2.f.f((Object)d, "sessionManager");
        ah2.f.f((Object)y, "moshi");
        ah2.f.f((Object)e, "modFeatures");
        ah2.f.f((Object)f, "modActionsDataSource");
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
        ah2.f.f((Object)s, "thingId");
        ah2.f.f((Object)s2, "specificReason");
        ah2.f.f((Object)reportType, "type");
        final int n2 = v.a.b[reportType.ordinal()];
        String s6;
        if (n2 != 1) {
            if (n2 == 2) {
                final String s3 = s2;
                s2 = null;
                final String s5;
                final String s4 = s5 = s2;
                return (c0<w<ResponseBody>>)u1.j1(RemoteModToolsDataSource.a.a(this.b, s, s2, null, s4, s3, s5, n, 4), (d)this.a);
            }
            if (n2 == 3) {
                final String s5 = s2;
                s2 = "other";
                final String s3;
                final String s4 = s3 = null;
                return (c0<w<ResponseBody>>)u1.j1(RemoteModToolsDataSource.a.a(this.b, s, s2, null, s4, s3, s5, n, 4), (d)this.a);
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
        return (c0<w<ResponseBody>>)u1.j1(RemoteModToolsDataSource.a.a(this.b, s, s2, null, s4, s3, s5, n, 4), (d)this.a);
    }
    
    @Override
    public final c0 b(final BulkAction bulkAction, final ArrayList list) {
        ah2.f.f((Object)bulkAction, "action");
        final StringBuilder sb = new StringBuilder();
        sb.append("{\"ids\":");
        sb.append(this.g.toJson((Object)list));
        sb.append('}');
        final RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse("application/json"), sb.toString());
        final int n = v.a.a[bulkAction.ordinal()];
        c0 c0;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    c0 = u1.j1((c0)this.b.bulkModActions(bulkAction.getValue(), create), (d)this.a).w((o)new u0(2));
                    ah2.f.e((Object)c0, "{\n        remote.bulkMod\u2026         .map { }\n      }");
                }
                else {
                    c0 = u1.W0((p)new RedditModToolsRepository$bulkModAction$3(this, (List)list, (c)null));
                }
            }
            else {
                c0 = u1.W0((p)new RedditModToolsRepository$bulkModAction$2(this, (List)list, (c)null));
            }
        }
        else {
            c0 = u1.W0((p)new RedditModToolsRepository$bulkModAction$1(this, (List)list, (c)null));
        }
        return u1.j1(c0, (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> c(final String s, final String s2, final String s3) {
        m.y(s, "subredditName", s2, "userId", s3, "username");
        return (c0<w<ResponseBody>>)u1.j1((c0)this.b.unmuteUser(s, s2, s3, ModToolsActionType.TYPE_MUTE), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> d(final String s, final BanInfoModel banInfoModel) {
        ah2.f.f((Object)s, "subredditName");
        final HashMap hashMap = new HashMap();
        if (banInfoModel.getBanContext() != null) {
            final String banContext = banInfoModel.getBanContext();
            ah2.f.c((Object)banContext);
            hashMap.put("ban_context", banContext);
        }
        hashMap.put("type", ModToolsActionType.TYPE_BAN.getAction());
        hashMap.put("name", banInfoModel.getUsername());
        hashMap.put("ban_reason", banInfoModel.getBanReason());
        hashMap.put("note", banInfoModel.getModNote());
        hashMap.put("ban_message", banInfoModel.getBanMessage());
        hashMap.put("api_type", "json");
        return (c0<PostResponseWithErrors>)u1.j1((c0)this.b.banUser(s, hashMap, banInfoModel.getDuration()), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> e(final String s, final ModToolsUserModel modToolsUserModel) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)modToolsUserModel, "user");
        return (c0<w<ResponseBody>>)u1.j1((c0)this.b.removeModerator(s, kotlin.collections.c.P1(new Pair[] { new Pair((Object)"id", (Object)modToolsUserModel.getId()), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR.getAction()) })), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> f(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<PostResponseWithErrors>)u1.j1((c0)this.b.addApprovedSubmitter(s, s2, ModToolsActionType.TYPE_CONTRIBUTOR, "json"), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> g(final String s, final ModToolsUserModel modToolsUserModel) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)modToolsUserModel, "user");
        return (c0<w<ResponseBody>>)u1.j1((c0)this.b.unbanUser(s, modToolsUserModel.getId(), null, ModToolsActionType.TYPE_BAN), (d)this.a);
    }
    
    @Override
    public final c0<ModeratorsResponse> getAllModerators(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<ModeratorsResponse>)u1.j1((c0)this.b.getAllModerators(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<ApprovedSubmittersResponse> getApprovedSubmitters(final String s, final String s2) {
        ah2.f.f((Object)s, "subreddditName");
        return (c0<ApprovedSubmittersResponse>)u1.j1((c0)this.b.getApprovedSubmitters(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<BannedUsersResponse> getBannedUsers(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<BannedUsersResponse>)u1.j1((c0)this.b.getBannedUsers(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<ModeratorsResponse> getEditableModerators(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<ModeratorsResponse>)u1.j1((c0)this.b.getEditableModerators(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<MutedUsersResponse> getMutedUsers(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<MutedUsersResponse>)u1.j1((c0)this.b.getMutedUsers(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<SubredditRulesResponse> getSubredditRules(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<SubredditRulesResponse>)u1.j1((c0)this.b.getSubredditRules(s), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> h(final String s, final String s2, final String s3) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<PostResponseWithErrors>)u1.j1((c0)this.b.inviteModerator(s, kotlin.collections.c.P1(new Pair[] { new Pair((Object)"name", (Object)s2), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR_INVITE.getAction()), new Pair((Object)"permissions", (Object)s3), new Pair((Object)"api_type", (Object)"json") })), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> i(final String s, final String s2) {
        ah2.f.f((Object)s, "subreddit");
        ah2.f.f((Object)s2, "iconUrl");
        return (c0<w<ResponseBody>>)u1.j1((c0)this.b.attachCommunityIcon(s, s2), (d)this.a);
    }
    
    @Override
    public final Object inviteToCommunity(final String s, final String s2, final ModToolsCommunityInviteType modToolsCommunityInviteType, final String s3, final String s4, final c<? super PostResponseWithErrors> c) {
        return this.b.inviteToCommunity(s, s2, modToolsCommunityInviteType, s4, s3, c);
    }
    
    @Override
    public final c0<PostResponseWithErrors> j(final String s, final String s2, final String s3) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<PostResponseWithErrors>)u1.j1((c0)this.b.editModerator(s, kotlin.collections.c.P1(new Pair[] { new Pair((Object)"name", (Object)s2), new Pair((Object)"type", (Object)ModToolsActionType.TYPE_MODERATOR.getAction()), new Pair((Object)"permissions", (Object)s3), new Pair((Object)"api_type", (Object)"json") })), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> k(final String s, final ModToolsUserModel modToolsUserModel) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)modToolsUserModel, "user");
        return (c0<w<ResponseBody>>)u1.j1((c0)this.b.unmuteUser(s, modToolsUserModel.getId(), modToolsUserModel.getUsername(), ModToolsActionType.TYPE_MUTE), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> l(final String s, final ModToolsUserModel modToolsUserModel) {
        ah2.f.f((Object)s, "subreddditName");
        ah2.f.f((Object)modToolsUserModel, "user");
        return (c0<w<ResponseBody>>)u1.j1((c0)this.b.removeApprovedSubmitter(s, modToolsUserModel.getId(), ModToolsActionType.TYPE_CONTRIBUTOR), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> m(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new cg2.c(u1.j1((c0)this.b.acceptModInvite(s, u1.B0(new Pair((Object)"api_type", (Object)"json"))), (d)this.a), new s(2, this, s)));
        ah2.f.e((Object)onAssembly, "remote.acceptModInvite(s\u2026ername)\n        }\n      }");
        return (c0<PostResponseWithErrors>)onAssembly;
    }
    
    @Override
    public final c0<FileUploadLease> n(final String s, final String s2, final String s3) {
        ah2.f.f((Object)s, "subreddit");
        ah2.f.f((Object)s3, "fileMimeType");
        return (c0<FileUploadLease>)u1.j1((c0)this.b.leaseCommunityIconUpload(s, s2, s3, "communityIcon"), (d)this.a);
    }
    
    @Override
    public final c0<PostResponseWithErrors> o(final String s, final String s2, final String s3) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<PostResponseWithErrors>)u1.j1((c0)this.b.muteUser(s, s2, s3, ModToolsActionType.TYPE_MUTE, "json"), (d)this.a);
    }
    
    @Override
    public final Object p(final String s, final c<? super j> c) {
        final Object declineCommunityInvite = this.b.declineCommunityInvite(s, "moderator_invite", m.s("api_type", "json"), c);
        if (declineCommunityInvite == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return declineCommunityInvite;
        }
        return j.a;
    }
    
    @Override
    public final Object q(final String s, final c<? super j> c) {
        final Object declineCommunityInvite = this.b.declineCommunityInvite(s, "subscriber_invite", m.s("api_type", "json"), c);
        if (declineCommunityInvite == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return declineCommunityInvite;
        }
        return j.a;
    }
    
    @Override
    public final c0<ApprovedSubmittersResponse> r(final String s, final String s2) {
        ah2.f.f((Object)s, "subreddditName");
        ah2.f.f((Object)s2, "username");
        return (c0<ApprovedSubmittersResponse>)u1.j1((c0)this.b.searchApprovedSubmitters(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> s(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return (c0<w<ResponseBody>>)u1.j1((c0)this.b.declineModInvite(s, u1.B0(new Pair((Object)"api_type", (Object)"json"))), (d)this.a);
    }
    
    @Override
    public final c0<ModeratorsResponse> searchAllModerators(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)s2, "username");
        final c0<ModeratorsResponse> searchAllModerators = this.b.searchAllModerators(s, s2);
        final a40.c c = new a40.c((Object)this, 1, (Object)s, (Object)s2);
        searchAllModerators.getClass();
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)searchAllModerators, (o)c));
        ah2.f.e((Object)onAssembly, "remote.searchAllModerato\u2026(Single.just(it))\n      }");
        final c0 w = this.c.b(s, s2).w(onAssembly);
        ah2.f.e((Object)w, "local.getModPermissions(\u2026   .switchIfEmpty(remote)");
        return (c0<ModeratorsResponse>)u1.j1(w, (d)this.a);
    }
    
    @Override
    public final c0<BannedUsersResponse> searchBannedUser(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)s2, "username");
        return (c0<BannedUsersResponse>)u1.j1((c0)this.b.searchBannedUser(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<ModeratorsResponse> searchEditableModerators(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)s2, "username");
        return (c0<ModeratorsResponse>)u1.j1((c0)this.b.searchEditableModerators(s, s2), (d)this.a);
    }
    
    @Override
    public final c0<MutedUsersResponse> searchMutedUser(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)s2, "username");
        return (c0<MutedUsersResponse>)u1.j1((c0)this.b.searchMutedUser(s, s2), (d)this.a);
    }
    
    @Override
    public final c0 t(final String s) {
        ah2.f.f((Object)s, "username");
        return u1.j1(RemoteModToolsDataSource.a.a(this.b, null, "site_reason_selected", s, "self harm", null, null, null, 113), (d)this.a);
    }
    
    @Override
    public final c0<w<ResponseBody>> unbanUser(final String s, final String s2, final String s3, final ModToolsActionType modToolsActionType) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)s2, "userId");
        ah2.f.f((Object)s3, "username");
        ah2.f.f((Object)modToolsActionType, "type");
        return (c0<w<ResponseBody>>)u1.j1((c0)this.b.unbanUser(s, s2, s3, modToolsActionType), (d)this.a);
    }
}
