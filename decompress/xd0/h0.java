// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import com.reddit.domain.model.RelatedSubredditsResponse;
import com.reddit.domain.model.tagging.SubredditTaggingQuestions;
import java.util.LinkedHashMap;
import com.reddit.domain.model.SubredditListItem;
import com.reddit.structuredstyles.model.StructuredStyle;
import com.reddit.domain.model.tagging.CrowdsourceTaggingQuestion;
import com.reddit.domain.model.communitycreation.SubredditTopic;
import com.reddit.domain.model.tagging.SubredditRatingSurveyAnswers;
import com.reddit.domain.model.SubredditTriggeredInvite;
import com.reddit.domain.model.communitycreation.CreateSubredditResult;
import com.reddit.domain.model.communitycreation.CreateSubreddit;
import java.io.Serializable;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.communitysettings.UpdateSubredditSettings;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.domain.model.UserSubredditListings;
import cj2.e;
import com.reddit.domain.model.communitycreation.SubredditTopicsResult;
import java.util.List;
import cg2.j;
import kotlinx.coroutines.flow.f;
import af2.t;
import com.reddit.domain.model.communitycreation.SubredditNameValidationResult;
import af2.c0;
import com.reddit.domain.model.Subreddit;
import af2.n;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.domain.model.SubredditActionSource;
import java.util.ArrayList;
import af2.a;
import java.util.Set;
import gg2.c;

public interface h0
{
    Object A(final c<? super Set<String>> p0);
    
    af2.a B(final String p0);
    
    af2.a C(final ArrayList p0, final SubredditActionSource p1);
    
    Object D(final String p0, final String p1, final c<? super UpdateResponse> p2);
    
    n<Subreddit> E(final String p0, final boolean p1);
    
    c0<SubredditNameValidationResult> F(final String p0);
    
    t G();
    
    Object H(final String p0, final c<? super UpdateResponse> p1);
    
    f I();
    
    Object J(final String p0, final c<? super j> p1);
    
    List<String> K();
    
    c0<List<String>> L(final String p0);
    
    c0 M();
    
    Object N(final String p0, final String p1, final c<? super UpdateResponse> p2);
    
    f O();
    
    c0<SubredditTopicsResult> P(final int p0, final String p1, final boolean p2);
    
    t Q(final String p0, final boolean p1);
    
    Object R(final c<? super e<UserSubredditListings>> p0);
    
    af2.a S(final String p0, final String p1, final NotificationLevel p2);
    
    Object T(final String p0, final ContinuationImpl p1);
    
    c0<Boolean> U(final Subreddit p0);
    
    c0<Set<String>> V(final String p0);
    
    Object W(final String p0, final c<? super j> p1);
    
    Object X(final String p0, final boolean p1, final c<? super UpdateResponse> p2);
    
    Object Y(final ArrayList p0, final c p1);
    
    Object Z(final String p0, final String p1, final c<? super UpdateResponse> p2);
    
    af2.a a(final String p0);
    
    c0<UpdateResponse> a0(final UpdateSubredditSettings p0);
    
    af2.a b(final String p0);
    
    af2.a b0(final String p0);
    
    c0<Boolean> c(final String p0);
    
    af2.a c0(final List<String> p0, final SubredditActionSource p1);
    
    af2.a d(final String p0);
    
    t d0(final String p0, final boolean p1);
    
    c0<Boolean> e(final String p0);
    
    Object e0(final String p0, final c<? super Result<Boolean>> p1);
    
    af2.a f(final String p0);
    
    Object f0(final String p0, final String p1, final c<? super UpdateResponse> p2);
    
    c0<List<Subreddit>> g();
    
    t g0(final String p0, final boolean p1);
    
    af2.a h(final String p0);
    
    Serializable h0(final List p0, final c p1);
    
    af2.a i();
    
    c0<CreateSubredditResult> i0(final CreateSubreddit p0);
    
    n<List<SubredditTriggeredInvite>> j();
    
    Object j0(final List<String> p0, final c<? super List<Subreddit>> p1);
    
    af2.a k(final String p0, final ArrayList p1);
    
    c0<Boolean> k0(final List<Subreddit> p0);
    
    c0<List<Subreddit>> l(final String p0);
    
    Object l0(final String p0, final SubredditRatingSurveyAnswers p1, final c<? super UpdateResponse> p2);
    
    Object m(final String p0, final c<? super Subreddit> p1);
    
    Object m0(final String p0, final c<? super SubredditTopic> p1);
    
    Object n(final String p0, final c<? super List<CrowdsourceTaggingQuestion>> p1);
    
    c0<StructuredStyle> n0(final String p0);
    
    Object o(final String p0, final ArrayList p1, final c p2);
    
    String p(final String p0, final String p1, final String p2);
    
    Object q(final c<? super List<SubredditListItem>> p0);
    
    c0 r(final String p0, final LinkedHashMap p1);
    
    Object s(final String p0, final c<? super SubredditTaggingQuestions> p1);
    
    c0 t(final String p0, final boolean p1);
    
    c0<RelatedSubredditsResponse> u(final String p0);
    
    Object v(final String p0, final String p1, final boolean p2, final c<? super UpdateResponse> p3);
    
    c0 w(final String p0, final boolean p1);
    
    Object x(final String p0, final String p1, final String p2, final c<? super UpdateResponse> p3);
    
    f y();
    
    n<Subreddit> z(final String p0, final boolean p1, final boolean p2);
    
    public static final class a
    {
        public static c0 a(final int n, final h0 h0, boolean b) {
            if ((n & 0x1) != 0x0) {
                b = false;
            }
            return h0.w(null, b);
        }
        
        public static n b(final h0 h0, final String s, boolean b, final int n) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            return h0.z(s, b, false);
        }
        
        public static c0 c(final int n, final h0 h0, boolean b) {
            if ((n & 0x1) != 0x0) {
                b = false;
            }
            return h0.t(null, b);
        }
        
        public static t d(final int n, final h0 h0, boolean b) {
            if ((n & 0x1) != 0x0) {
                b = false;
            }
            return h0.Q(null, b);
        }
    }
}
