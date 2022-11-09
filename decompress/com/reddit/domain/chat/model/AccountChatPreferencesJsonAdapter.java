// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Type;
import a4.u1;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/chat/model/AccountChatPreferencesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/AccountChatPreferences;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/chat/model/AccountChatPreferences$InvitePolicy;", "invitePolicyAtSafeEnumAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccountChatPreferencesJsonAdapter extends JsonAdapter<AccountChatPreferences>
{
    private final JsonAdapter<AccountChatPreferences.InvitePolicy> invitePolicyAtSafeEnumAdapter;
    private final JsonReader$b options;
    
    public AccountChatPreferencesJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "invite_policy" });
        this.invitePolicyAtSafeEnumAdapter = (JsonAdapter<AccountChatPreferences.InvitePolicy>)y.c((Type)AccountChatPreferences.InvitePolicy.class, u1.Z0((Object)new AccountChatPreferencesJsonAdapter$annotationImpl$com_reddit_data_common_SafeEnum.AccountChatPreferencesJsonAdapter$annotationImpl$com_reddit_data_common_SafeEnum$0("anybody")), "invitePolicy");
    }
    
    public AccountChatPreferences fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Enum<AccountChatPreferences.InvitePolicy> enum1 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    continue;
                }
                enum1 = (AccountChatPreferences.InvitePolicy)this.invitePolicyAtSafeEnumAdapter.fromJson(jsonReader);
                if (enum1 != null) {
                    continue;
                }
                throw a.n("invitePolicy", "invite_policy", jsonReader);
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (enum1 != null) {
            return new AccountChatPreferences((AccountChatPreferences.InvitePolicy)enum1);
        }
        throw a.h("invitePolicy", "invite_policy", jsonReader);
    }
    
    public void toJson(final x x, final AccountChatPreferences accountChatPreferences) {
        f.f((Object)x, "writer");
        if (accountChatPreferences != null) {
            x.h();
            x.w("invite_policy");
            this.invitePolicyAtSafeEnumAdapter.toJson(x, (Object)accountChatPreferences.getInvitePolicy());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(AccountChatPreferences)";
    }
}
