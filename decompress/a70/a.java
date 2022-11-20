// 
// Decompiled by Procyon v0.6.0
// 

package a70;

import com.reddit.domain.survey.model.TriggerEvent;
import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import com.reddit.domain.survey.model.SurveyStep$Score$Type;

public final class a
{
    public static final String a(final SurveyStep$Score$Type surveyStep$Score$Type) {
        e.f((Object)surveyStep$Score$Type, "<this>");
        final int n = a.a[((Enum)surveyStep$Score$Type).ordinal()];
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                s = "CES";
            }
            else {
                s = "NPS";
            }
        }
        else {
            s = "CSAT";
        }
        return s;
    }
    
    public static final String b(final TriggerEvent triggerEvent) {
        e.f((Object)triggerEvent, "<this>");
        String friendlyName = null;
        switch (a.b[((Enum)triggerEvent).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 12: {
                friendlyName = "search_view_trigger";
                break;
            }
            case 11: {
                friendlyName = triggerEvent.getFriendlyName();
                break;
            }
            case 9:
            case 10: {
                friendlyName = null;
                break;
            }
            case 8: {
                friendlyName = "chat_view_trigger";
                break;
            }
            case 7: {
                friendlyName = "onboarding_scroll_1_page";
                break;
            }
            case 6: {
                friendlyName = "mods_feed_scroll_1_page";
                break;
            }
            case 5: {
                friendlyName = "videos_viewed";
                break;
            }
            case 4: {
                friendlyName = "click_bottom_nav_tab";
                break;
            }
            case 3: {
                friendlyName = "dismiss_post";
                break;
            }
            case 2: {
                friendlyName = "one_feed_scroll_1_page";
                break;
            }
            case 1: {
                friendlyName = "feed_scroll_1_page";
                break;
            }
        }
        return friendlyName;
    }
    
    public final class a
    {
        public static final int[] a;
        public static final int[] b;
        
        static {
            final int[] a2 = new int[SurveyStep$Score$Type.values().length];
            a2[((Enum)SurveyStep$Score$Type.CSAT).ordinal()] = 1;
            a2[((Enum)SurveyStep$Score$Type.NPS).ordinal()] = 2;
            a2[((Enum)SurveyStep$Score$Type.CES).ordinal()] = 3;
            a = a2;
            final int[] b2 = new int[TriggerEvent.values().length];
            b2[((Enum)TriggerEvent.FEED_SCROLL_1_PAGE).ordinal()] = 1;
            b2[((Enum)TriggerEvent.ONE_FEED_SCROLL_1_PAGE).ordinal()] = 2;
            b2[((Enum)TriggerEvent.DISMISS_POST).ordinal()] = 3;
            b2[((Enum)TriggerEvent.CLICK_BOTTOM_NAV_TAB).ordinal()] = 4;
            b2[((Enum)TriggerEvent.VIDEOS_VIEWED).ordinal()] = 5;
            b2[((Enum)TriggerEvent.MODS_FEED_SCROLL_1_PAGE).ordinal()] = 6;
            b2[((Enum)TriggerEvent.ONBOARDING_SCROLL_1_PAGE).ordinal()] = 7;
            b2[((Enum)TriggerEvent.CHAT_VIEW_TRIGGER).ordinal()] = 8;
            b2[((Enum)TriggerEvent.TEST_1).ordinal()] = 9;
            b2[((Enum)TriggerEvent.TEST_2).ordinal()] = 10;
            b2[((Enum)TriggerEvent.INITIAL_FEED_SCROLL_3_PAGE).ordinal()] = 11;
            b2[((Enum)TriggerEvent.SEARCH_VIEW_TRIGGER).ordinal()] = 12;
            b = b2;
        }
    }
}
