// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.repository;

import kotlin.Metadata;
import com.reddit.domain.modtools.ModToolsActionType;
import cg2.j;
import com.reddit.domain.model.FileUploadLease;
import gg2.c;
import com.reddit.domain.modtools.ModToolsCommunityInviteType;
import com.reddit.domain.model.mod.SubredditRulesResponse;
import com.reddit.domain.model.mod.MutedUsersResponse;
import com.reddit.domain.model.mod.BannedUsersResponse;
import com.reddit.domain.model.mod.ApprovedSubmittersResponse;
import com.reddit.domain.model.mod.ModeratorsResponse;
import com.reddit.domain.model.mod.ModToolsUserModel;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import com.reddit.domain.modtools.BanInfoModel;
import java.util.ArrayList;
import okhttp3.ResponseBody;
import ku2.w;
import af2.c0;

public interface ModToolsRepository
{
    c0<w<ResponseBody>> a(final String p0, final String p1, final ReportType p2, final Long p3);
    
    c0 b(final BulkAction p0, final ArrayList p1);
    
    c0<w<ResponseBody>> c(final String p0, final String p1, final String p2);
    
    c0<PostResponseWithErrors> d(final String p0, final BanInfoModel p1);
    
    c0<w<ResponseBody>> e(final String p0, final ModToolsUserModel p1);
    
    c0<PostResponseWithErrors> f(final String p0, final String p1);
    
    c0<w<ResponseBody>> g(final String p0, final ModToolsUserModel p1);
    
    c0<ModeratorsResponse> getAllModerators(final String p0, final String p1);
    
    c0<ApprovedSubmittersResponse> getApprovedSubmitters(final String p0, final String p1);
    
    c0<BannedUsersResponse> getBannedUsers(final String p0, final String p1);
    
    c0<ModeratorsResponse> getEditableModerators(final String p0, final String p1);
    
    c0<MutedUsersResponse> getMutedUsers(final String p0, final String p1);
    
    c0<SubredditRulesResponse> getSubredditRules(final String p0);
    
    c0<PostResponseWithErrors> h(final String p0, final String p1, final String p2);
    
    c0<w<ResponseBody>> i(final String p0, final String p1);
    
    Object inviteToCommunity(final String p0, final String p1, final ModToolsCommunityInviteType p2, final String p3, final String p4, final c<? super PostResponseWithErrors> p5);
    
    c0<PostResponseWithErrors> j(final String p0, final String p1, final String p2);
    
    c0<w<ResponseBody>> k(final String p0, final ModToolsUserModel p1);
    
    c0<w<ResponseBody>> l(final String p0, final ModToolsUserModel p1);
    
    c0<PostResponseWithErrors> m(final String p0);
    
    c0<FileUploadLease> n(final String p0, final String p1, final String p2);
    
    c0<PostResponseWithErrors> o(final String p0, final String p1, final String p2);
    
    Object p(final String p0, final c<? super j> p1);
    
    Object q(final String p0, final c<? super j> p1);
    
    c0<ApprovedSubmittersResponse> r(final String p0, final String p1);
    
    c0<w<ResponseBody>> s(final String p0);
    
    c0<ModeratorsResponse> searchAllModerators(final String p0, final String p1);
    
    c0<BannedUsersResponse> searchBannedUser(final String p0, final String p1);
    
    c0<ModeratorsResponse> searchEditableModerators(final String p0, final String p1);
    
    c0<MutedUsersResponse> searchMutedUser(final String p0, final String p1);
    
    c0 t(final String p0);
    
    c0<w<ResponseBody>> unbanUser(final String p0, final String p1, final String p2, final ModToolsActionType p3);
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/repository/ModToolsRepository$BulkAction;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACTION_APPROVE", "ACTION_REMOVE", "ACTION_SPAM", "ACTION_IGNORE_REPORTS", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum BulkAction
    {
        private static final BulkAction[] $VALUES;
        
        ACTION_APPROVE("approve"), 
        ACTION_IGNORE_REPORTS("ignore_reports"), 
        ACTION_REMOVE("remove"), 
        ACTION_SPAM("spam");
        
        private final String value;
        
        private static final BulkAction[] $values() {
            return new BulkAction[] { BulkAction.ACTION_APPROVE, BulkAction.ACTION_REMOVE, BulkAction.ACTION_SPAM, BulkAction.ACTION_IGNORE_REPORTS };
        }
        
        static {
            $VALUES = $values();
        }
        
        private BulkAction(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/repository/ModToolsRepository$ReportType;", "", "(Ljava/lang/String;I)V", "SITEWIDE", "RULE", "OTHER", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum ReportType
    {
        private static final ReportType[] $VALUES;
        
        OTHER, 
        RULE, 
        SITEWIDE;
        
        private static final ReportType[] $values() {
            return new ReportType[] { ReportType.SITEWIDE, ReportType.RULE, ReportType.OTHER };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
