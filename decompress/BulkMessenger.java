// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class BulkMessenger
{
    public static final a<BulkMessenger, BulkMessenger.BulkMessenger$Builder> ADAPTER;
    public final Boolean add_admin_note;
    public final Boolean add_to_sent_box;
    public final String admin_note;
    public final Boolean distinguished;
    public final Integer failed_count;
    public final Integer give_coins;
    public final String job_id;
    public final String message_body;
    public final String message_type;
    public final Integer recipient_count;
    public final String recipient_type;
    public final Boolean repliable;
    public final String sender_id;
    public final String sender_name;
    public final String subject;
    public final Integer success_count;
    
    static {
        ADAPTER = (a)new BulkMessenger.BulkMessenger$BulkMessengerAdapter((BulkMessenger$1)null);
    }
    
    private BulkMessenger(final BulkMessenger.BulkMessenger$Builder bulkMessenger$Builder) {
        this.sender_id = BulkMessenger.BulkMessenger$Builder.access$100(bulkMessenger$Builder);
        this.subject = BulkMessenger.BulkMessenger$Builder.access$200(bulkMessenger$Builder);
        this.message_type = BulkMessenger.BulkMessenger$Builder.access$300(bulkMessenger$Builder);
        this.message_body = BulkMessenger.BulkMessenger$Builder.access$400(bulkMessenger$Builder);
        this.repliable = BulkMessenger.BulkMessenger$Builder.access$500(bulkMessenger$Builder);
        this.distinguished = BulkMessenger.BulkMessenger$Builder.access$600(bulkMessenger$Builder);
        this.add_to_sent_box = BulkMessenger.BulkMessenger$Builder.access$700(bulkMessenger$Builder);
        this.add_admin_note = BulkMessenger.BulkMessenger$Builder.access$800(bulkMessenger$Builder);
        this.admin_note = BulkMessenger.BulkMessenger$Builder.access$900(bulkMessenger$Builder);
        this.give_coins = BulkMessenger.BulkMessenger$Builder.access$1000(bulkMessenger$Builder);
        this.recipient_type = BulkMessenger.BulkMessenger$Builder.access$1100(bulkMessenger$Builder);
        this.recipient_count = BulkMessenger.BulkMessenger$Builder.access$1200(bulkMessenger$Builder);
        this.job_id = BulkMessenger.BulkMessenger$Builder.access$1300(bulkMessenger$Builder);
        this.sender_name = BulkMessenger.BulkMessenger$Builder.access$1400(bulkMessenger$Builder);
        this.success_count = BulkMessenger.BulkMessenger$Builder.access$1500(bulkMessenger$Builder);
        this.failed_count = BulkMessenger.BulkMessenger$Builder.access$1600(bulkMessenger$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof BulkMessenger)) {
            return false;
        }
        final BulkMessenger bulkMessenger = (BulkMessenger)o;
        final String sender_id = this.sender_id;
        final String sender_id2 = bulkMessenger.sender_id;
        if (sender_id == sender_id2 || (sender_id != null && sender_id.equals(sender_id2))) {
            final String subject = this.subject;
            final String subject2 = bulkMessenger.subject;
            if (subject == subject2 || (subject != null && subject.equals(subject2))) {
                final String message_type = this.message_type;
                final String message_type2 = bulkMessenger.message_type;
                if (message_type == message_type2 || (message_type != null && message_type.equals(message_type2))) {
                    final String message_body = this.message_body;
                    final String message_body2 = bulkMessenger.message_body;
                    if (message_body == message_body2 || (message_body != null && message_body.equals(message_body2))) {
                        final Boolean repliable = this.repliable;
                        final Boolean repliable2 = bulkMessenger.repliable;
                        if (repliable == repliable2 || (repliable != null && repliable.equals(repliable2))) {
                            final Boolean distinguished = this.distinguished;
                            final Boolean distinguished2 = bulkMessenger.distinguished;
                            if (distinguished == distinguished2 || (distinguished != null && distinguished.equals(distinguished2))) {
                                final Boolean add_to_sent_box = this.add_to_sent_box;
                                final Boolean add_to_sent_box2 = bulkMessenger.add_to_sent_box;
                                if (add_to_sent_box == add_to_sent_box2 || (add_to_sent_box != null && add_to_sent_box.equals(add_to_sent_box2))) {
                                    final Boolean add_admin_note = this.add_admin_note;
                                    final Boolean add_admin_note2 = bulkMessenger.add_admin_note;
                                    if (add_admin_note == add_admin_note2 || (add_admin_note != null && add_admin_note.equals(add_admin_note2))) {
                                        final String admin_note = this.admin_note;
                                        final String admin_note2 = bulkMessenger.admin_note;
                                        if (admin_note == admin_note2 || (admin_note != null && admin_note.equals(admin_note2))) {
                                            final Integer give_coins = this.give_coins;
                                            final Integer give_coins2 = bulkMessenger.give_coins;
                                            if (give_coins == give_coins2 || (give_coins != null && give_coins.equals(give_coins2))) {
                                                final String recipient_type = this.recipient_type;
                                                final String recipient_type2 = bulkMessenger.recipient_type;
                                                if (recipient_type == recipient_type2 || (recipient_type != null && recipient_type.equals(recipient_type2))) {
                                                    final Integer recipient_count = this.recipient_count;
                                                    final Integer recipient_count2 = bulkMessenger.recipient_count;
                                                    if (recipient_count == recipient_count2 || (recipient_count != null && recipient_count.equals(recipient_count2))) {
                                                        final String job_id = this.job_id;
                                                        final String job_id2 = bulkMessenger.job_id;
                                                        if (job_id == job_id2 || (job_id != null && job_id.equals(job_id2))) {
                                                            final String sender_name = this.sender_name;
                                                            final String sender_name2 = bulkMessenger.sender_name;
                                                            if (sender_name == sender_name2 || (sender_name != null && sender_name.equals(sender_name2))) {
                                                                final Integer success_count = this.success_count;
                                                                final Integer success_count2 = bulkMessenger.success_count;
                                                                if (success_count == success_count2 || (success_count != null && success_count.equals(success_count2))) {
                                                                    final Integer failed_count = this.failed_count;
                                                                    final Integer failed_count2 = bulkMessenger.failed_count;
                                                                    boolean b2 = b;
                                                                    if (failed_count == failed_count2) {
                                                                        return b2;
                                                                    }
                                                                    if (failed_count != null && failed_count.equals(failed_count2)) {
                                                                        b2 = b;
                                                                        return b2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String sender_id = this.sender_id;
        int hashCode = 0;
        int hashCode2;
        if (sender_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = sender_id.hashCode();
        }
        final String subject = this.subject;
        int hashCode3;
        if (subject == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subject.hashCode();
        }
        final String message_type = this.message_type;
        int hashCode4;
        if (message_type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = message_type.hashCode();
        }
        final String message_body = this.message_body;
        int hashCode5;
        if (message_body == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = message_body.hashCode();
        }
        final Boolean repliable = this.repliable;
        int hashCode6;
        if (repliable == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = repliable.hashCode();
        }
        final Boolean distinguished = this.distinguished;
        int hashCode7;
        if (distinguished == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = distinguished.hashCode();
        }
        final Boolean add_to_sent_box = this.add_to_sent_box;
        int hashCode8;
        if (add_to_sent_box == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = add_to_sent_box.hashCode();
        }
        final Boolean add_admin_note = this.add_admin_note;
        int hashCode9;
        if (add_admin_note == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = add_admin_note.hashCode();
        }
        final String admin_note = this.admin_note;
        int hashCode10;
        if (admin_note == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = admin_note.hashCode();
        }
        final Integer give_coins = this.give_coins;
        int hashCode11;
        if (give_coins == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = give_coins.hashCode();
        }
        final String recipient_type = this.recipient_type;
        int hashCode12;
        if (recipient_type == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = recipient_type.hashCode();
        }
        final Integer recipient_count = this.recipient_count;
        int hashCode13;
        if (recipient_count == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = recipient_count.hashCode();
        }
        final String job_id = this.job_id;
        int hashCode14;
        if (job_id == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = job_id.hashCode();
        }
        final String sender_name = this.sender_name;
        int hashCode15;
        if (sender_name == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = sender_name.hashCode();
        }
        final Integer success_count = this.success_count;
        int hashCode16;
        if (success_count == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = success_count.hashCode();
        }
        final Integer failed_count = this.failed_count;
        if (failed_count != null) {
            hashCode = failed_count.hashCode();
        }
        return ((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("BulkMessenger{sender_id=");
        k.append(this.sender_id);
        k.append(", subject=");
        k.append(this.subject);
        k.append(", message_type=");
        k.append(this.message_type);
        k.append(", message_body=");
        k.append(this.message_body);
        k.append(", repliable=");
        k.append(this.repliable);
        k.append(", distinguished=");
        k.append(this.distinguished);
        k.append(", add_to_sent_box=");
        k.append(this.add_to_sent_box);
        k.append(", add_admin_note=");
        k.append(this.add_admin_note);
        k.append(", admin_note=");
        k.append(this.admin_note);
        k.append(", give_coins=");
        k.append(this.give_coins);
        k.append(", recipient_type=");
        k.append(this.recipient_type);
        k.append(", recipient_count=");
        k.append(this.recipient_count);
        k.append(", job_id=");
        k.append(this.job_id);
        k.append(", sender_name=");
        k.append(this.sender_name);
        k.append(", success_count=");
        k.append(this.success_count);
        k.append(", failed_count=");
        k.append(this.failed_count);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        BulkMessenger.ADAPTER.write(e, (Object)this);
    }
}
