// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.x1;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import u10.o;
import t5.w;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class SubredditsMsg$SubredditPostRequirementsResponse extends GeneratedMessageLite<SubredditsMsg$SubredditPostRequirementsResponse, a> implements d1
{
    public static final int BODY_BLACKLISTED_STRINGS_FIELD_NUMBER = 2;
    public static final int BODY_REGEXES_FIELD_NUMBER = 20;
    public static final int BODY_REQUIRED_STRINGS_FIELD_NUMBER = 14;
    public static final int BODY_RESTRICTION_POLICY_FIELD_NUMBER = 11;
    public static final int BODY_TEXT_MAX_LENGTH_FIELD_NUMBER = 4;
    public static final int BODY_TEXT_MIN_LENGTH_FIELD_NUMBER = 22;
    private static final SubredditsMsg$SubredditPostRequirementsResponse DEFAULT_INSTANCE;
    public static final int DOMAIN_BLACKLIST_FIELD_NUMBER = 8;
    public static final int DOMAIN_WHITELIST_FIELD_NUMBER = 9;
    public static final int GALLERY_CAPTIONS_REQUIREMENT_FIELD_NUMBER = 16;
    public static final int GALLERY_MAX_ITEMS_FIELD_NUMBER = 18;
    public static final int GALLERY_MIN_ITEMS_FIELD_NUMBER = 7;
    public static final int GALLERY_URLS_REQUIREMENT_FIELD_NUMBER = 19;
    public static final int GUIDELINES_DISPLAY_POLICY_FIELD_NUMBER = 13;
    public static final int GUIDELINES_TEXT_FIELD_NUMBER = 6;
    public static final int IS_FLAIR_REQUIRED_FIELD_NUMBER = 17;
    public static final int LINK_REPOST_AGE_FIELD_NUMBER = 21;
    public static final int LINK_RESTRICTION_POLICY_FIELD_NUMBER = 12;
    private static volatile n1<SubredditsMsg$SubredditPostRequirementsResponse> PARSER;
    public static final int TITLE_BLACKLISTED_STRINGS_FIELD_NUMBER = 3;
    public static final int TITLE_REGEXES_FIELD_NUMBER = 1;
    public static final int TITLE_REQUIRED_STRINGS_FIELD_NUMBER = 5;
    public static final int TITLE_TEXT_MAX_LENGTH_FIELD_NUMBER = 10;
    public static final int TITLE_TEXT_MIN_LENGTH_FIELD_NUMBER = 15;
    private Internal$j<StringValue> bodyBlacklistedStrings_;
    private Internal$j<StringValue> bodyRegexes_;
    private Internal$j<StringValue> bodyRequiredStrings_;
    private StringValue bodyRestrictionPolicy_;
    private Int32Value bodyTextMaxLength_;
    private Int32Value bodyTextMinLength_;
    private Internal$j<StringValue> domainBlacklist_;
    private Internal$j<StringValue> domainWhitelist_;
    private StringValue galleryCaptionsRequirement_;
    private Int32Value galleryMaxItems_;
    private Int32Value galleryMinItems_;
    private StringValue galleryUrlsRequirement_;
    private StringValue guidelinesDisplayPolicy_;
    private StringValue guidelinesText_;
    private BoolValue isFlairRequired_;
    private Int32Value linkRepostAge_;
    private StringValue linkRestrictionPolicy_;
    private Internal$j<StringValue> titleBlacklistedStrings_;
    private Internal$j<StringValue> titleRegexes_;
    private Internal$j<StringValue> titleRequiredStrings_;
    private Int32Value titleTextMaxLength_;
    private Int32Value titleTextMinLength_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditPostRequirementsResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditPostRequirementsResponse()));
    }
    
    private SubredditsMsg$SubredditPostRequirementsResponse() {
        this.titleRegexes_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.bodyBlacklistedStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.titleBlacklistedStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.titleRequiredStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.domainBlacklist_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.domainWhitelist_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.bodyRequiredStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.bodyRegexes_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse access$68800() {
        return SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$68900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.setTitleRegexes(n, stringValue);
    }
    
    public static void access$69000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addTitleRegexes(stringValue);
    }
    
    public static void access$69100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addTitleRegexes(n, stringValue);
    }
    
    public static void access$69200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Iterable iterable) {
        subredditsMsg$SubredditPostRequirementsResponse.addAllTitleRegexes(iterable);
    }
    
    public static void access$69300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearTitleRegexes();
    }
    
    public static void access$69400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n) {
        subredditsMsg$SubredditPostRequirementsResponse.removeTitleRegexes(n);
    }
    
    public static void access$69500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.setBodyBlacklistedStrings(n, stringValue);
    }
    
    public static void access$69600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addBodyBlacklistedStrings(stringValue);
    }
    
    public static void access$69700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addBodyBlacklistedStrings(n, stringValue);
    }
    
    public static void access$69800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Iterable iterable) {
        subredditsMsg$SubredditPostRequirementsResponse.addAllBodyBlacklistedStrings(iterable);
    }
    
    public static void access$69900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearBodyBlacklistedStrings();
    }
    
    public static void access$70000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n) {
        subredditsMsg$SubredditPostRequirementsResponse.removeBodyBlacklistedStrings(n);
    }
    
    public static void access$70100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.setTitleBlacklistedStrings(n, stringValue);
    }
    
    public static void access$70200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addTitleBlacklistedStrings(stringValue);
    }
    
    public static void access$70300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addTitleBlacklistedStrings(n, stringValue);
    }
    
    public static void access$70400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Iterable iterable) {
        subredditsMsg$SubredditPostRequirementsResponse.addAllTitleBlacklistedStrings(iterable);
    }
    
    public static void access$70500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearTitleBlacklistedStrings();
    }
    
    public static void access$70600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n) {
        subredditsMsg$SubredditPostRequirementsResponse.removeTitleBlacklistedStrings(n);
    }
    
    public static void access$70700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value bodyTextMaxLength) {
        subredditsMsg$SubredditPostRequirementsResponse.setBodyTextMaxLength(bodyTextMaxLength);
    }
    
    public static void access$70800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value int32Value) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeBodyTextMaxLength(int32Value);
    }
    
    public static void access$70900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearBodyTextMaxLength();
    }
    
    public static void access$71000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.setTitleRequiredStrings(n, stringValue);
    }
    
    public static void access$71100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addTitleRequiredStrings(stringValue);
    }
    
    public static void access$71200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addTitleRequiredStrings(n, stringValue);
    }
    
    public static void access$71300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Iterable iterable) {
        subredditsMsg$SubredditPostRequirementsResponse.addAllTitleRequiredStrings(iterable);
    }
    
    public static void access$71400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearTitleRequiredStrings();
    }
    
    public static void access$71500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n) {
        subredditsMsg$SubredditPostRequirementsResponse.removeTitleRequiredStrings(n);
    }
    
    public static void access$71600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue guidelinesText) {
        subredditsMsg$SubredditPostRequirementsResponse.setGuidelinesText(guidelinesText);
    }
    
    public static void access$71700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeGuidelinesText(stringValue);
    }
    
    public static void access$71800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearGuidelinesText();
    }
    
    public static void access$71900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value galleryMinItems) {
        subredditsMsg$SubredditPostRequirementsResponse.setGalleryMinItems(galleryMinItems);
    }
    
    public static void access$72000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value int32Value) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeGalleryMinItems(int32Value);
    }
    
    public static void access$72100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearGalleryMinItems();
    }
    
    public static void access$72200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.setDomainBlacklist(n, stringValue);
    }
    
    public static void access$72300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addDomainBlacklist(stringValue);
    }
    
    public static void access$72400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addDomainBlacklist(n, stringValue);
    }
    
    public static void access$72500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Iterable iterable) {
        subredditsMsg$SubredditPostRequirementsResponse.addAllDomainBlacklist(iterable);
    }
    
    public static void access$72600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearDomainBlacklist();
    }
    
    public static void access$72700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n) {
        subredditsMsg$SubredditPostRequirementsResponse.removeDomainBlacklist(n);
    }
    
    public static void access$72800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.setDomainWhitelist(n, stringValue);
    }
    
    public static void access$72900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addDomainWhitelist(stringValue);
    }
    
    public static void access$73000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addDomainWhitelist(n, stringValue);
    }
    
    public static void access$73100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Iterable iterable) {
        subredditsMsg$SubredditPostRequirementsResponse.addAllDomainWhitelist(iterable);
    }
    
    public static void access$73200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearDomainWhitelist();
    }
    
    public static void access$73300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n) {
        subredditsMsg$SubredditPostRequirementsResponse.removeDomainWhitelist(n);
    }
    
    public static void access$73400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value titleTextMaxLength) {
        subredditsMsg$SubredditPostRequirementsResponse.setTitleTextMaxLength(titleTextMaxLength);
    }
    
    public static void access$73500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value int32Value) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeTitleTextMaxLength(int32Value);
    }
    
    public static void access$73600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearTitleTextMaxLength();
    }
    
    public static void access$73700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue bodyRestrictionPolicy) {
        subredditsMsg$SubredditPostRequirementsResponse.setBodyRestrictionPolicy(bodyRestrictionPolicy);
    }
    
    public static void access$73800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeBodyRestrictionPolicy(stringValue);
    }
    
    public static void access$73900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearBodyRestrictionPolicy();
    }
    
    public static void access$74000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue linkRestrictionPolicy) {
        subredditsMsg$SubredditPostRequirementsResponse.setLinkRestrictionPolicy(linkRestrictionPolicy);
    }
    
    public static void access$74100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeLinkRestrictionPolicy(stringValue);
    }
    
    public static void access$74200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearLinkRestrictionPolicy();
    }
    
    public static void access$74300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue guidelinesDisplayPolicy) {
        subredditsMsg$SubredditPostRequirementsResponse.setGuidelinesDisplayPolicy(guidelinesDisplayPolicy);
    }
    
    public static void access$74400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeGuidelinesDisplayPolicy(stringValue);
    }
    
    public static void access$74500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearGuidelinesDisplayPolicy();
    }
    
    public static void access$74600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.setBodyRequiredStrings(n, stringValue);
    }
    
    public static void access$74700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addBodyRequiredStrings(stringValue);
    }
    
    public static void access$74800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addBodyRequiredStrings(n, stringValue);
    }
    
    public static void access$74900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Iterable iterable) {
        subredditsMsg$SubredditPostRequirementsResponse.addAllBodyRequiredStrings(iterable);
    }
    
    public static void access$75000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearBodyRequiredStrings();
    }
    
    public static void access$75100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n) {
        subredditsMsg$SubredditPostRequirementsResponse.removeBodyRequiredStrings(n);
    }
    
    public static void access$75200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value titleTextMinLength) {
        subredditsMsg$SubredditPostRequirementsResponse.setTitleTextMinLength(titleTextMinLength);
    }
    
    public static void access$75300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value int32Value) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeTitleTextMinLength(int32Value);
    }
    
    public static void access$75400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearTitleTextMinLength();
    }
    
    public static void access$75500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue galleryCaptionsRequirement) {
        subredditsMsg$SubredditPostRequirementsResponse.setGalleryCaptionsRequirement(galleryCaptionsRequirement);
    }
    
    public static void access$75600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeGalleryCaptionsRequirement(stringValue);
    }
    
    public static void access$75700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearGalleryCaptionsRequirement();
    }
    
    public static void access$75800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final BoolValue isFlairRequired) {
        subredditsMsg$SubredditPostRequirementsResponse.setIsFlairRequired(isFlairRequired);
    }
    
    public static void access$75900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final BoolValue boolValue) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeIsFlairRequired(boolValue);
    }
    
    public static void access$76000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearIsFlairRequired();
    }
    
    public static void access$76100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value galleryMaxItems) {
        subredditsMsg$SubredditPostRequirementsResponse.setGalleryMaxItems(galleryMaxItems);
    }
    
    public static void access$76200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value int32Value) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeGalleryMaxItems(int32Value);
    }
    
    public static void access$76300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearGalleryMaxItems();
    }
    
    public static void access$76400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue galleryUrlsRequirement) {
        subredditsMsg$SubredditPostRequirementsResponse.setGalleryUrlsRequirement(galleryUrlsRequirement);
    }
    
    public static void access$76500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeGalleryUrlsRequirement(stringValue);
    }
    
    public static void access$76600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearGalleryUrlsRequirement();
    }
    
    public static void access$76700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.setBodyRegexes(n, stringValue);
    }
    
    public static void access$76800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addBodyRegexes(stringValue);
    }
    
    public static void access$76900(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditPostRequirementsResponse.addBodyRegexes(n, stringValue);
    }
    
    public static void access$77000(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Iterable iterable) {
        subredditsMsg$SubredditPostRequirementsResponse.addAllBodyRegexes(iterable);
    }
    
    public static void access$77100(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearBodyRegexes();
    }
    
    public static void access$77200(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final int n) {
        subredditsMsg$SubredditPostRequirementsResponse.removeBodyRegexes(n);
    }
    
    public static void access$77300(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value linkRepostAge) {
        subredditsMsg$SubredditPostRequirementsResponse.setLinkRepostAge(linkRepostAge);
    }
    
    public static void access$77400(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value int32Value) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeLinkRepostAge(int32Value);
    }
    
    public static void access$77500(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearLinkRepostAge();
    }
    
    public static void access$77600(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value bodyTextMinLength) {
        subredditsMsg$SubredditPostRequirementsResponse.setBodyTextMinLength(bodyTextMinLength);
    }
    
    public static void access$77700(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse, final Int32Value int32Value) {
        subredditsMsg$SubredditPostRequirementsResponse.mergeBodyTextMinLength(int32Value);
    }
    
    public static void access$77800(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        subredditsMsg$SubredditPostRequirementsResponse.clearBodyTextMinLength();
    }
    
    private void addAllBodyBlacklistedStrings(final Iterable<? extends StringValue> iterable) {
        this.ensureBodyBlacklistedStringsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.bodyBlacklistedStrings_);
    }
    
    private void addAllBodyRegexes(final Iterable<? extends StringValue> iterable) {
        this.ensureBodyRegexesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.bodyRegexes_);
    }
    
    private void addAllBodyRequiredStrings(final Iterable<? extends StringValue> iterable) {
        this.ensureBodyRequiredStringsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.bodyRequiredStrings_);
    }
    
    private void addAllDomainBlacklist(final Iterable<? extends StringValue> iterable) {
        this.ensureDomainBlacklistIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.domainBlacklist_);
    }
    
    private void addAllDomainWhitelist(final Iterable<? extends StringValue> iterable) {
        this.ensureDomainWhitelistIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.domainWhitelist_);
    }
    
    private void addAllTitleBlacklistedStrings(final Iterable<? extends StringValue> iterable) {
        this.ensureTitleBlacklistedStringsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.titleBlacklistedStrings_);
    }
    
    private void addAllTitleRegexes(final Iterable<? extends StringValue> iterable) {
        this.ensureTitleRegexesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.titleRegexes_);
    }
    
    private void addAllTitleRequiredStrings(final Iterable<? extends StringValue> iterable) {
        this.ensureTitleRequiredStringsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.titleRequiredStrings_);
    }
    
    private void addBodyBlacklistedStrings(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyBlacklistedStringsIsMutable();
        ((List<StringValue>)this.bodyBlacklistedStrings_).add(n, stringValue);
    }
    
    private void addBodyBlacklistedStrings(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyBlacklistedStringsIsMutable();
        ((List<StringValue>)this.bodyBlacklistedStrings_).add(stringValue);
    }
    
    private void addBodyRegexes(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyRegexesIsMutable();
        ((List<StringValue>)this.bodyRegexes_).add(n, stringValue);
    }
    
    private void addBodyRegexes(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyRegexesIsMutable();
        ((List<StringValue>)this.bodyRegexes_).add(stringValue);
    }
    
    private void addBodyRequiredStrings(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyRequiredStringsIsMutable();
        ((List<StringValue>)this.bodyRequiredStrings_).add(n, stringValue);
    }
    
    private void addBodyRequiredStrings(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyRequiredStringsIsMutable();
        ((List<StringValue>)this.bodyRequiredStrings_).add(stringValue);
    }
    
    private void addDomainBlacklist(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureDomainBlacklistIsMutable();
        ((List<StringValue>)this.domainBlacklist_).add(n, stringValue);
    }
    
    private void addDomainBlacklist(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureDomainBlacklistIsMutable();
        ((List<StringValue>)this.domainBlacklist_).add(stringValue);
    }
    
    private void addDomainWhitelist(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureDomainWhitelistIsMutable();
        ((List<StringValue>)this.domainWhitelist_).add(n, stringValue);
    }
    
    private void addDomainWhitelist(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureDomainWhitelistIsMutable();
        ((List<StringValue>)this.domainWhitelist_).add(stringValue);
    }
    
    private void addTitleBlacklistedStrings(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleBlacklistedStringsIsMutable();
        ((List<StringValue>)this.titleBlacklistedStrings_).add(n, stringValue);
    }
    
    private void addTitleBlacklistedStrings(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleBlacklistedStringsIsMutable();
        ((List<StringValue>)this.titleBlacklistedStrings_).add(stringValue);
    }
    
    private void addTitleRegexes(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleRegexesIsMutable();
        ((List<StringValue>)this.titleRegexes_).add(n, stringValue);
    }
    
    private void addTitleRegexes(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleRegexesIsMutable();
        ((List<StringValue>)this.titleRegexes_).add(stringValue);
    }
    
    private void addTitleRequiredStrings(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleRequiredStringsIsMutable();
        ((List<StringValue>)this.titleRequiredStrings_).add(n, stringValue);
    }
    
    private void addTitleRequiredStrings(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleRequiredStringsIsMutable();
        ((List<StringValue>)this.titleRequiredStrings_).add(stringValue);
    }
    
    private void clearBodyBlacklistedStrings() {
        this.bodyBlacklistedStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearBodyRegexes() {
        this.bodyRegexes_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearBodyRequiredStrings() {
        this.bodyRequiredStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearBodyRestrictionPolicy() {
        this.bodyRestrictionPolicy_ = null;
    }
    
    private void clearBodyTextMaxLength() {
        this.bodyTextMaxLength_ = null;
    }
    
    private void clearBodyTextMinLength() {
        this.bodyTextMinLength_ = null;
    }
    
    private void clearDomainBlacklist() {
        this.domainBlacklist_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearDomainWhitelist() {
        this.domainWhitelist_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearGalleryCaptionsRequirement() {
        this.galleryCaptionsRequirement_ = null;
    }
    
    private void clearGalleryMaxItems() {
        this.galleryMaxItems_ = null;
    }
    
    private void clearGalleryMinItems() {
        this.galleryMinItems_ = null;
    }
    
    private void clearGalleryUrlsRequirement() {
        this.galleryUrlsRequirement_ = null;
    }
    
    private void clearGuidelinesDisplayPolicy() {
        this.guidelinesDisplayPolicy_ = null;
    }
    
    private void clearGuidelinesText() {
        this.guidelinesText_ = null;
    }
    
    private void clearIsFlairRequired() {
        this.isFlairRequired_ = null;
    }
    
    private void clearLinkRepostAge() {
        this.linkRepostAge_ = null;
    }
    
    private void clearLinkRestrictionPolicy() {
        this.linkRestrictionPolicy_ = null;
    }
    
    private void clearTitleBlacklistedStrings() {
        this.titleBlacklistedStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearTitleRegexes() {
        this.titleRegexes_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearTitleRequiredStrings() {
        this.titleRequiredStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearTitleTextMaxLength() {
        this.titleTextMaxLength_ = null;
    }
    
    private void clearTitleTextMinLength() {
        this.titleTextMinLength_ = null;
    }
    
    private void ensureBodyBlacklistedStringsIsMutable() {
        final Internal$j<StringValue> bodyBlacklistedStrings_ = this.bodyBlacklistedStrings_;
        if (!bodyBlacklistedStrings_.E0()) {
            this.bodyBlacklistedStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)bodyBlacklistedStrings_);
        }
    }
    
    private void ensureBodyRegexesIsMutable() {
        final Internal$j<StringValue> bodyRegexes_ = this.bodyRegexes_;
        if (!bodyRegexes_.E0()) {
            this.bodyRegexes_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)bodyRegexes_);
        }
    }
    
    private void ensureBodyRequiredStringsIsMutable() {
        final Internal$j<StringValue> bodyRequiredStrings_ = this.bodyRequiredStrings_;
        if (!bodyRequiredStrings_.E0()) {
            this.bodyRequiredStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)bodyRequiredStrings_);
        }
    }
    
    private void ensureDomainBlacklistIsMutable() {
        final Internal$j<StringValue> domainBlacklist_ = this.domainBlacklist_;
        if (!domainBlacklist_.E0()) {
            this.domainBlacklist_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)domainBlacklist_);
        }
    }
    
    private void ensureDomainWhitelistIsMutable() {
        final Internal$j<StringValue> domainWhitelist_ = this.domainWhitelist_;
        if (!domainWhitelist_.E0()) {
            this.domainWhitelist_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)domainWhitelist_);
        }
    }
    
    private void ensureTitleBlacklistedStringsIsMutable() {
        final Internal$j<StringValue> titleBlacklistedStrings_ = this.titleBlacklistedStrings_;
        if (!titleBlacklistedStrings_.E0()) {
            this.titleBlacklistedStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)titleBlacklistedStrings_);
        }
    }
    
    private void ensureTitleRegexesIsMutable() {
        final Internal$j<StringValue> titleRegexes_ = this.titleRegexes_;
        if (!titleRegexes_.E0()) {
            this.titleRegexes_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)titleRegexes_);
        }
    }
    
    private void ensureTitleRequiredStringsIsMutable() {
        final Internal$j<StringValue> titleRequiredStrings_ = this.titleRequiredStrings_;
        if (!titleRequiredStrings_.E0()) {
            this.titleRequiredStrings_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)titleRequiredStrings_);
        }
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse getDefaultInstance() {
        return SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeBodyRestrictionPolicy(final StringValue bodyRestrictionPolicy_) {
        bodyRestrictionPolicy_.getClass();
        final StringValue bodyRestrictionPolicy_2 = this.bodyRestrictionPolicy_;
        if (bodyRestrictionPolicy_2 != null && bodyRestrictionPolicy_2 != StringValue.getDefaultInstance()) {
            this.bodyRestrictionPolicy_ = (StringValue)w.e(this.bodyRestrictionPolicy_, bodyRestrictionPolicy_);
        }
        else {
            this.bodyRestrictionPolicy_ = bodyRestrictionPolicy_;
        }
    }
    
    private void mergeBodyTextMaxLength(final Int32Value bodyTextMaxLength_) {
        bodyTextMaxLength_.getClass();
        final Int32Value bodyTextMaxLength_2 = this.bodyTextMaxLength_;
        if (bodyTextMaxLength_2 != null && bodyTextMaxLength_2 != Int32Value.getDefaultInstance()) {
            this.bodyTextMaxLength_ = (Int32Value)b.d(this.bodyTextMaxLength_, bodyTextMaxLength_);
        }
        else {
            this.bodyTextMaxLength_ = bodyTextMaxLength_;
        }
    }
    
    private void mergeBodyTextMinLength(final Int32Value bodyTextMinLength_) {
        bodyTextMinLength_.getClass();
        final Int32Value bodyTextMinLength_2 = this.bodyTextMinLength_;
        if (bodyTextMinLength_2 != null && bodyTextMinLength_2 != Int32Value.getDefaultInstance()) {
            this.bodyTextMinLength_ = (Int32Value)b.d(this.bodyTextMinLength_, bodyTextMinLength_);
        }
        else {
            this.bodyTextMinLength_ = bodyTextMinLength_;
        }
    }
    
    private void mergeGalleryCaptionsRequirement(final StringValue galleryCaptionsRequirement_) {
        galleryCaptionsRequirement_.getClass();
        final StringValue galleryCaptionsRequirement_2 = this.galleryCaptionsRequirement_;
        if (galleryCaptionsRequirement_2 != null && galleryCaptionsRequirement_2 != StringValue.getDefaultInstance()) {
            this.galleryCaptionsRequirement_ = (StringValue)w.e(this.galleryCaptionsRequirement_, galleryCaptionsRequirement_);
        }
        else {
            this.galleryCaptionsRequirement_ = galleryCaptionsRequirement_;
        }
    }
    
    private void mergeGalleryMaxItems(final Int32Value galleryMaxItems_) {
        galleryMaxItems_.getClass();
        final Int32Value galleryMaxItems_2 = this.galleryMaxItems_;
        if (galleryMaxItems_2 != null && galleryMaxItems_2 != Int32Value.getDefaultInstance()) {
            this.galleryMaxItems_ = (Int32Value)b.d(this.galleryMaxItems_, galleryMaxItems_);
        }
        else {
            this.galleryMaxItems_ = galleryMaxItems_;
        }
    }
    
    private void mergeGalleryMinItems(final Int32Value galleryMinItems_) {
        galleryMinItems_.getClass();
        final Int32Value galleryMinItems_2 = this.galleryMinItems_;
        if (galleryMinItems_2 != null && galleryMinItems_2 != Int32Value.getDefaultInstance()) {
            this.galleryMinItems_ = (Int32Value)b.d(this.galleryMinItems_, galleryMinItems_);
        }
        else {
            this.galleryMinItems_ = galleryMinItems_;
        }
    }
    
    private void mergeGalleryUrlsRequirement(final StringValue galleryUrlsRequirement_) {
        galleryUrlsRequirement_.getClass();
        final StringValue galleryUrlsRequirement_2 = this.galleryUrlsRequirement_;
        if (galleryUrlsRequirement_2 != null && galleryUrlsRequirement_2 != StringValue.getDefaultInstance()) {
            this.galleryUrlsRequirement_ = (StringValue)w.e(this.galleryUrlsRequirement_, galleryUrlsRequirement_);
        }
        else {
            this.galleryUrlsRequirement_ = galleryUrlsRequirement_;
        }
    }
    
    private void mergeGuidelinesDisplayPolicy(final StringValue guidelinesDisplayPolicy_) {
        guidelinesDisplayPolicy_.getClass();
        final StringValue guidelinesDisplayPolicy_2 = this.guidelinesDisplayPolicy_;
        if (guidelinesDisplayPolicy_2 != null && guidelinesDisplayPolicy_2 != StringValue.getDefaultInstance()) {
            this.guidelinesDisplayPolicy_ = (StringValue)w.e(this.guidelinesDisplayPolicy_, guidelinesDisplayPolicy_);
        }
        else {
            this.guidelinesDisplayPolicy_ = guidelinesDisplayPolicy_;
        }
    }
    
    private void mergeGuidelinesText(final StringValue guidelinesText_) {
        guidelinesText_.getClass();
        final StringValue guidelinesText_2 = this.guidelinesText_;
        if (guidelinesText_2 != null && guidelinesText_2 != StringValue.getDefaultInstance()) {
            this.guidelinesText_ = (StringValue)w.e(this.guidelinesText_, guidelinesText_);
        }
        else {
            this.guidelinesText_ = guidelinesText_;
        }
    }
    
    private void mergeIsFlairRequired(final BoolValue isFlairRequired_) {
        isFlairRequired_.getClass();
        final BoolValue isFlairRequired_2 = this.isFlairRequired_;
        if (isFlairRequired_2 != null && isFlairRequired_2 != BoolValue.getDefaultInstance()) {
            this.isFlairRequired_ = (BoolValue)o.g(this.isFlairRequired_, isFlairRequired_);
        }
        else {
            this.isFlairRequired_ = isFlairRequired_;
        }
    }
    
    private void mergeLinkRepostAge(final Int32Value linkRepostAge_) {
        linkRepostAge_.getClass();
        final Int32Value linkRepostAge_2 = this.linkRepostAge_;
        if (linkRepostAge_2 != null && linkRepostAge_2 != Int32Value.getDefaultInstance()) {
            this.linkRepostAge_ = (Int32Value)b.d(this.linkRepostAge_, linkRepostAge_);
        }
        else {
            this.linkRepostAge_ = linkRepostAge_;
        }
    }
    
    private void mergeLinkRestrictionPolicy(final StringValue linkRestrictionPolicy_) {
        linkRestrictionPolicy_.getClass();
        final StringValue linkRestrictionPolicy_2 = this.linkRestrictionPolicy_;
        if (linkRestrictionPolicy_2 != null && linkRestrictionPolicy_2 != StringValue.getDefaultInstance()) {
            this.linkRestrictionPolicy_ = (StringValue)w.e(this.linkRestrictionPolicy_, linkRestrictionPolicy_);
        }
        else {
            this.linkRestrictionPolicy_ = linkRestrictionPolicy_;
        }
    }
    
    private void mergeTitleTextMaxLength(final Int32Value titleTextMaxLength_) {
        titleTextMaxLength_.getClass();
        final Int32Value titleTextMaxLength_2 = this.titleTextMaxLength_;
        if (titleTextMaxLength_2 != null && titleTextMaxLength_2 != Int32Value.getDefaultInstance()) {
            this.titleTextMaxLength_ = (Int32Value)b.d(this.titleTextMaxLength_, titleTextMaxLength_);
        }
        else {
            this.titleTextMaxLength_ = titleTextMaxLength_;
        }
    }
    
    private void mergeTitleTextMinLength(final Int32Value titleTextMinLength_) {
        titleTextMinLength_.getClass();
        final Int32Value titleTextMinLength_2 = this.titleTextMinLength_;
        if (titleTextMinLength_2 != null && titleTextMinLength_2 != Int32Value.getDefaultInstance()) {
            this.titleTextMinLength_ = (Int32Value)b.d(this.titleTextMinLength_, titleTextMinLength_);
        }
        else {
            this.titleTextMinLength_ = titleTextMinLength_;
        }
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditPostRequirementsResponse subredditsMsg$SubredditPostRequirementsResponse) {
        return (a)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditPostRequirementsResponse);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditPostRequirementsResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditPostRequirementsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditPostRequirementsResponse> parser() {
        return (n1<SubredditsMsg$SubredditPostRequirementsResponse>)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeBodyBlacklistedStrings(final int n) {
        this.ensureBodyBlacklistedStringsIsMutable();
        this.bodyBlacklistedStrings_.remove(n);
    }
    
    private void removeBodyRegexes(final int n) {
        this.ensureBodyRegexesIsMutable();
        this.bodyRegexes_.remove(n);
    }
    
    private void removeBodyRequiredStrings(final int n) {
        this.ensureBodyRequiredStringsIsMutable();
        this.bodyRequiredStrings_.remove(n);
    }
    
    private void removeDomainBlacklist(final int n) {
        this.ensureDomainBlacklistIsMutable();
        this.domainBlacklist_.remove(n);
    }
    
    private void removeDomainWhitelist(final int n) {
        this.ensureDomainWhitelistIsMutable();
        this.domainWhitelist_.remove(n);
    }
    
    private void removeTitleBlacklistedStrings(final int n) {
        this.ensureTitleBlacklistedStringsIsMutable();
        this.titleBlacklistedStrings_.remove(n);
    }
    
    private void removeTitleRegexes(final int n) {
        this.ensureTitleRegexesIsMutable();
        this.titleRegexes_.remove(n);
    }
    
    private void removeTitleRequiredStrings(final int n) {
        this.ensureTitleRequiredStringsIsMutable();
        this.titleRequiredStrings_.remove(n);
    }
    
    private void setBodyBlacklistedStrings(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyBlacklistedStringsIsMutable();
        ((List<StringValue>)this.bodyBlacklistedStrings_).set(n, stringValue);
    }
    
    private void setBodyRegexes(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyRegexesIsMutable();
        ((List<StringValue>)this.bodyRegexes_).set(n, stringValue);
    }
    
    private void setBodyRequiredStrings(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureBodyRequiredStringsIsMutable();
        ((List<StringValue>)this.bodyRequiredStrings_).set(n, stringValue);
    }
    
    private void setBodyRestrictionPolicy(final StringValue bodyRestrictionPolicy_) {
        bodyRestrictionPolicy_.getClass();
        this.bodyRestrictionPolicy_ = bodyRestrictionPolicy_;
    }
    
    private void setBodyTextMaxLength(final Int32Value bodyTextMaxLength_) {
        bodyTextMaxLength_.getClass();
        this.bodyTextMaxLength_ = bodyTextMaxLength_;
    }
    
    private void setBodyTextMinLength(final Int32Value bodyTextMinLength_) {
        bodyTextMinLength_.getClass();
        this.bodyTextMinLength_ = bodyTextMinLength_;
    }
    
    private void setDomainBlacklist(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureDomainBlacklistIsMutable();
        ((List<StringValue>)this.domainBlacklist_).set(n, stringValue);
    }
    
    private void setDomainWhitelist(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureDomainWhitelistIsMutable();
        ((List<StringValue>)this.domainWhitelist_).set(n, stringValue);
    }
    
    private void setGalleryCaptionsRequirement(final StringValue galleryCaptionsRequirement_) {
        galleryCaptionsRequirement_.getClass();
        this.galleryCaptionsRequirement_ = galleryCaptionsRequirement_;
    }
    
    private void setGalleryMaxItems(final Int32Value galleryMaxItems_) {
        galleryMaxItems_.getClass();
        this.galleryMaxItems_ = galleryMaxItems_;
    }
    
    private void setGalleryMinItems(final Int32Value galleryMinItems_) {
        galleryMinItems_.getClass();
        this.galleryMinItems_ = galleryMinItems_;
    }
    
    private void setGalleryUrlsRequirement(final StringValue galleryUrlsRequirement_) {
        galleryUrlsRequirement_.getClass();
        this.galleryUrlsRequirement_ = galleryUrlsRequirement_;
    }
    
    private void setGuidelinesDisplayPolicy(final StringValue guidelinesDisplayPolicy_) {
        guidelinesDisplayPolicy_.getClass();
        this.guidelinesDisplayPolicy_ = guidelinesDisplayPolicy_;
    }
    
    private void setGuidelinesText(final StringValue guidelinesText_) {
        guidelinesText_.getClass();
        this.guidelinesText_ = guidelinesText_;
    }
    
    private void setIsFlairRequired(final BoolValue isFlairRequired_) {
        isFlairRequired_.getClass();
        this.isFlairRequired_ = isFlairRequired_;
    }
    
    private void setLinkRepostAge(final Int32Value linkRepostAge_) {
        linkRepostAge_.getClass();
        this.linkRepostAge_ = linkRepostAge_;
    }
    
    private void setLinkRestrictionPolicy(final StringValue linkRestrictionPolicy_) {
        linkRestrictionPolicy_.getClass();
        this.linkRestrictionPolicy_ = linkRestrictionPolicy_;
    }
    
    private void setTitleBlacklistedStrings(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleBlacklistedStringsIsMutable();
        ((List<StringValue>)this.titleBlacklistedStrings_).set(n, stringValue);
    }
    
    private void setTitleRegexes(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleRegexesIsMutable();
        ((List<StringValue>)this.titleRegexes_).set(n, stringValue);
    }
    
    private void setTitleRequiredStrings(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureTitleRequiredStringsIsMutable();
        ((List<StringValue>)this.titleRequiredStrings_).set(n, stringValue);
    }
    
    private void setTitleTextMaxLength(final Int32Value titleTextMaxLength_) {
        titleTextMaxLength_.getClass();
        this.titleTextMaxLength_ = titleTextMaxLength_;
    }
    
    private void setTitleTextMinLength(final Int32Value titleTextMinLength_) {
        titleTextMinLength_.getClass();
        this.titleTextMinLength_ = titleTextMinLength_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (h90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return 1;
            }
            case 5: {
                final n1<SubredditsMsg$SubredditPostRequirementsResponse> parser;
                if ((parser = SubredditsMsg$SubredditPostRequirementsResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditPostRequirementsResponse.class) {
                        if (SubredditsMsg$SubredditPostRequirementsResponse.PARSER == null) {
                            SubredditsMsg$SubredditPostRequirementsResponse.PARSER = (n1<SubredditsMsg$SubredditPostRequirementsResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditPostRequirementsResponse.DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0000\u0001\u0016\u0016\u0000\b\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\t\u0005\u001b\u0006\t\u0007\t\b\u001b\t\u001b\n\t\u000b\t\f\t\r\t\u000e\u001b\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\u001b\u0015\t\u0016\t", new Object[] { "titleRegexes_", StringValue.class, "bodyBlacklistedStrings_", StringValue.class, "titleBlacklistedStrings_", StringValue.class, "bodyTextMaxLength_", "titleRequiredStrings_", StringValue.class, "guidelinesText_", "galleryMinItems_", "domainBlacklist_", StringValue.class, "domainWhitelist_", StringValue.class, "titleTextMaxLength_", "bodyRestrictionPolicy_", "linkRestrictionPolicy_", "guidelinesDisplayPolicy_", "bodyRequiredStrings_", StringValue.class, "titleTextMinLength_", "galleryCaptionsRequirement_", "isFlairRequired_", "galleryMaxItems_", "galleryUrlsRequirement_", "bodyRegexes_", StringValue.class, "linkRepostAge_", "bodyTextMinLength_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditPostRequirementsResponse();
            }
        }
    }
    
    public StringValue getBodyBlacklistedStrings(final int n) {
        return ((List<StringValue>)this.bodyBlacklistedStrings_).get(n);
    }
    
    public int getBodyBlacklistedStringsCount() {
        return ((List)this.bodyBlacklistedStrings_).size();
    }
    
    public List<StringValue> getBodyBlacklistedStringsList() {
        return (List<StringValue>)this.bodyBlacklistedStrings_;
    }
    
    public x1 getBodyBlacklistedStringsOrBuilder(final int n) {
        return ((List<x1>)this.bodyBlacklistedStrings_).get(n);
    }
    
    public List<? extends x1> getBodyBlacklistedStringsOrBuilderList() {
        return (List<? extends x1>)this.bodyBlacklistedStrings_;
    }
    
    public StringValue getBodyRegexes(final int n) {
        return ((List<StringValue>)this.bodyRegexes_).get(n);
    }
    
    public int getBodyRegexesCount() {
        return ((List)this.bodyRegexes_).size();
    }
    
    public List<StringValue> getBodyRegexesList() {
        return (List<StringValue>)this.bodyRegexes_;
    }
    
    public x1 getBodyRegexesOrBuilder(final int n) {
        return ((List<x1>)this.bodyRegexes_).get(n);
    }
    
    public List<? extends x1> getBodyRegexesOrBuilderList() {
        return (List<? extends x1>)this.bodyRegexes_;
    }
    
    public StringValue getBodyRequiredStrings(final int n) {
        return ((List<StringValue>)this.bodyRequiredStrings_).get(n);
    }
    
    public int getBodyRequiredStringsCount() {
        return ((List)this.bodyRequiredStrings_).size();
    }
    
    public List<StringValue> getBodyRequiredStringsList() {
        return (List<StringValue>)this.bodyRequiredStrings_;
    }
    
    public x1 getBodyRequiredStringsOrBuilder(final int n) {
        return ((List<x1>)this.bodyRequiredStrings_).get(n);
    }
    
    public List<? extends x1> getBodyRequiredStringsOrBuilderList() {
        return (List<? extends x1>)this.bodyRequiredStrings_;
    }
    
    public StringValue getBodyRestrictionPolicy() {
        StringValue stringValue;
        if ((stringValue = this.bodyRestrictionPolicy_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Int32Value getBodyTextMaxLength() {
        Int32Value int32Value;
        if ((int32Value = this.bodyTextMaxLength_) == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }
    
    public Int32Value getBodyTextMinLength() {
        Int32Value int32Value;
        if ((int32Value = this.bodyTextMinLength_) == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }
    
    public StringValue getDomainBlacklist(final int n) {
        return ((List<StringValue>)this.domainBlacklist_).get(n);
    }
    
    public int getDomainBlacklistCount() {
        return ((List)this.domainBlacklist_).size();
    }
    
    public List<StringValue> getDomainBlacklistList() {
        return (List<StringValue>)this.domainBlacklist_;
    }
    
    public x1 getDomainBlacklistOrBuilder(final int n) {
        return ((List<x1>)this.domainBlacklist_).get(n);
    }
    
    public List<? extends x1> getDomainBlacklistOrBuilderList() {
        return (List<? extends x1>)this.domainBlacklist_;
    }
    
    public StringValue getDomainWhitelist(final int n) {
        return ((List<StringValue>)this.domainWhitelist_).get(n);
    }
    
    public int getDomainWhitelistCount() {
        return ((List)this.domainWhitelist_).size();
    }
    
    public List<StringValue> getDomainWhitelistList() {
        return (List<StringValue>)this.domainWhitelist_;
    }
    
    public x1 getDomainWhitelistOrBuilder(final int n) {
        return ((List<x1>)this.domainWhitelist_).get(n);
    }
    
    public List<? extends x1> getDomainWhitelistOrBuilderList() {
        return (List<? extends x1>)this.domainWhitelist_;
    }
    
    public StringValue getGalleryCaptionsRequirement() {
        StringValue stringValue;
        if ((stringValue = this.galleryCaptionsRequirement_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Int32Value getGalleryMaxItems() {
        Int32Value int32Value;
        if ((int32Value = this.galleryMaxItems_) == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }
    
    public Int32Value getGalleryMinItems() {
        Int32Value int32Value;
        if ((int32Value = this.galleryMinItems_) == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }
    
    public StringValue getGalleryUrlsRequirement() {
        StringValue stringValue;
        if ((stringValue = this.galleryUrlsRequirement_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getGuidelinesDisplayPolicy() {
        StringValue stringValue;
        if ((stringValue = this.guidelinesDisplayPolicy_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getGuidelinesText() {
        StringValue stringValue;
        if ((stringValue = this.guidelinesText_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getIsFlairRequired() {
        BoolValue boolValue;
        if ((boolValue = this.isFlairRequired_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public Int32Value getLinkRepostAge() {
        Int32Value int32Value;
        if ((int32Value = this.linkRepostAge_) == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }
    
    public StringValue getLinkRestrictionPolicy() {
        StringValue stringValue;
        if ((stringValue = this.linkRestrictionPolicy_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getTitleBlacklistedStrings(final int n) {
        return ((List<StringValue>)this.titleBlacklistedStrings_).get(n);
    }
    
    public int getTitleBlacklistedStringsCount() {
        return ((List)this.titleBlacklistedStrings_).size();
    }
    
    public List<StringValue> getTitleBlacklistedStringsList() {
        return (List<StringValue>)this.titleBlacklistedStrings_;
    }
    
    public x1 getTitleBlacklistedStringsOrBuilder(final int n) {
        return ((List<x1>)this.titleBlacklistedStrings_).get(n);
    }
    
    public List<? extends x1> getTitleBlacklistedStringsOrBuilderList() {
        return (List<? extends x1>)this.titleBlacklistedStrings_;
    }
    
    public StringValue getTitleRegexes(final int n) {
        return ((List<StringValue>)this.titleRegexes_).get(n);
    }
    
    public int getTitleRegexesCount() {
        return ((List)this.titleRegexes_).size();
    }
    
    public List<StringValue> getTitleRegexesList() {
        return (List<StringValue>)this.titleRegexes_;
    }
    
    public x1 getTitleRegexesOrBuilder(final int n) {
        return ((List<x1>)this.titleRegexes_).get(n);
    }
    
    public List<? extends x1> getTitleRegexesOrBuilderList() {
        return (List<? extends x1>)this.titleRegexes_;
    }
    
    public StringValue getTitleRequiredStrings(final int n) {
        return ((List<StringValue>)this.titleRequiredStrings_).get(n);
    }
    
    public int getTitleRequiredStringsCount() {
        return ((List)this.titleRequiredStrings_).size();
    }
    
    public List<StringValue> getTitleRequiredStringsList() {
        return (List<StringValue>)this.titleRequiredStrings_;
    }
    
    public x1 getTitleRequiredStringsOrBuilder(final int n) {
        return ((List<x1>)this.titleRequiredStrings_).get(n);
    }
    
    public List<? extends x1> getTitleRequiredStringsOrBuilderList() {
        return (List<? extends x1>)this.titleRequiredStrings_;
    }
    
    public Int32Value getTitleTextMaxLength() {
        Int32Value int32Value;
        if ((int32Value = this.titleTextMaxLength_) == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }
    
    public Int32Value getTitleTextMinLength() {
        Int32Value int32Value;
        if ((int32Value = this.titleTextMinLength_) == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }
    
    public boolean hasBodyRestrictionPolicy() {
        return this.bodyRestrictionPolicy_ != null;
    }
    
    public boolean hasBodyTextMaxLength() {
        return this.bodyTextMaxLength_ != null;
    }
    
    public boolean hasBodyTextMinLength() {
        return this.bodyTextMinLength_ != null;
    }
    
    public boolean hasGalleryCaptionsRequirement() {
        return this.galleryCaptionsRequirement_ != null;
    }
    
    public boolean hasGalleryMaxItems() {
        return this.galleryMaxItems_ != null;
    }
    
    public boolean hasGalleryMinItems() {
        return this.galleryMinItems_ != null;
    }
    
    public boolean hasGalleryUrlsRequirement() {
        return this.galleryUrlsRequirement_ != null;
    }
    
    public boolean hasGuidelinesDisplayPolicy() {
        return this.guidelinesDisplayPolicy_ != null;
    }
    
    public boolean hasGuidelinesText() {
        return this.guidelinesText_ != null;
    }
    
    public boolean hasIsFlairRequired() {
        return this.isFlairRequired_ != null;
    }
    
    public boolean hasLinkRepostAge() {
        return this.linkRepostAge_ != null;
    }
    
    public boolean hasLinkRestrictionPolicy() {
        return this.linkRestrictionPolicy_ != null;
    }
    
    public boolean hasTitleTextMaxLength() {
        return this.titleTextMaxLength_ != null;
    }
    
    public boolean hasTitleTextMinLength() {
        return this.titleTextMinLength_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditPostRequirementsResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditPostRequirementsResponse.access$68800());
        }
    }
}
