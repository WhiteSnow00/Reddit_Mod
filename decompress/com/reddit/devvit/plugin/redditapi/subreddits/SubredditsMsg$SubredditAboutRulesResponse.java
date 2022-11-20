// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import p1.h;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.GeneratedMessageLite$b;
import t5.w;
import u10.o;
import com.google.protobuf.BoolValue;
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
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.StringValue;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class SubredditsMsg$SubredditAboutRulesResponse extends GeneratedMessageLite<SubredditsMsg$SubredditAboutRulesResponse, a> implements d1
{
    private static final SubredditsMsg$SubredditAboutRulesResponse DEFAULT_INSTANCE;
    private static volatile n1<SubredditsMsg$SubredditAboutRulesResponse> PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    public static final int SITE_RULES_FIELD_NUMBER = 2;
    public static final int SITE_RULES_FLOW_FIELD_NUMBER = 3;
    private Internal$j<SubredditRule> rules_;
    private Internal$j<RuleFlow> siteRulesFlow_;
    private Internal$j<StringValue> siteRules_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditAboutRulesResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditAboutRulesResponse()));
    }
    
    private SubredditsMsg$SubredditAboutRulesResponse() {
        this.rules_ = (Internal$j<SubredditRule>)GeneratedMessageLite.emptyProtobufList();
        this.siteRules_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.siteRulesFlow_ = (Internal$j<RuleFlow>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse access$139400() {
        return SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$139500(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n, final SubredditRule subredditRule) {
        subredditsMsg$SubredditAboutRulesResponse.setRules(n, subredditRule);
    }
    
    public static void access$139600(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final SubredditRule subredditRule) {
        subredditsMsg$SubredditAboutRulesResponse.addRules(subredditRule);
    }
    
    public static void access$139700(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n, final SubredditRule subredditRule) {
        subredditsMsg$SubredditAboutRulesResponse.addRules(n, subredditRule);
    }
    
    public static void access$139800(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final Iterable iterable) {
        subredditsMsg$SubredditAboutRulesResponse.addAllRules(iterable);
    }
    
    public static void access$139900(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse) {
        subredditsMsg$SubredditAboutRulesResponse.clearRules();
    }
    
    public static void access$140000(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n) {
        subredditsMsg$SubredditAboutRulesResponse.removeRules(n);
    }
    
    public static void access$140100(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditAboutRulesResponse.setSiteRules(n, stringValue);
    }
    
    public static void access$140200(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final StringValue stringValue) {
        subredditsMsg$SubredditAboutRulesResponse.addSiteRules(stringValue);
    }
    
    public static void access$140300(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n, final StringValue stringValue) {
        subredditsMsg$SubredditAboutRulesResponse.addSiteRules(n, stringValue);
    }
    
    public static void access$140400(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final Iterable iterable) {
        subredditsMsg$SubredditAboutRulesResponse.addAllSiteRules(iterable);
    }
    
    public static void access$140500(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse) {
        subredditsMsg$SubredditAboutRulesResponse.clearSiteRules();
    }
    
    public static void access$140600(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n) {
        subredditsMsg$SubredditAboutRulesResponse.removeSiteRules(n);
    }
    
    public static void access$140700(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n, final RuleFlow ruleFlow) {
        subredditsMsg$SubredditAboutRulesResponse.setSiteRulesFlow(n, ruleFlow);
    }
    
    public static void access$140800(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final RuleFlow ruleFlow) {
        subredditsMsg$SubredditAboutRulesResponse.addSiteRulesFlow(ruleFlow);
    }
    
    public static void access$140900(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n, final RuleFlow ruleFlow) {
        subredditsMsg$SubredditAboutRulesResponse.addSiteRulesFlow(n, ruleFlow);
    }
    
    public static void access$141000(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final Iterable iterable) {
        subredditsMsg$SubredditAboutRulesResponse.addAllSiteRulesFlow(iterable);
    }
    
    public static void access$141100(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse) {
        subredditsMsg$SubredditAboutRulesResponse.clearSiteRulesFlow();
    }
    
    public static void access$141200(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse, final int n) {
        subredditsMsg$SubredditAboutRulesResponse.removeSiteRulesFlow(n);
    }
    
    private void addAllRules(final Iterable<? extends SubredditRule> iterable) {
        this.ensureRulesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.rules_);
    }
    
    private void addAllSiteRules(final Iterable<? extends StringValue> iterable) {
        this.ensureSiteRulesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.siteRules_);
    }
    
    private void addAllSiteRulesFlow(final Iterable<? extends RuleFlow> iterable) {
        this.ensureSiteRulesFlowIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.siteRulesFlow_);
    }
    
    private void addRules(final int n, final SubredditRule subredditRule) {
        subredditRule.getClass();
        this.ensureRulesIsMutable();
        ((List<SubredditRule>)this.rules_).add(n, subredditRule);
    }
    
    private void addRules(final SubredditRule subredditRule) {
        subredditRule.getClass();
        this.ensureRulesIsMutable();
        ((List<SubredditRule>)this.rules_).add(subredditRule);
    }
    
    private void addSiteRules(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureSiteRulesIsMutable();
        ((List<StringValue>)this.siteRules_).add(n, stringValue);
    }
    
    private void addSiteRules(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureSiteRulesIsMutable();
        ((List<StringValue>)this.siteRules_).add(stringValue);
    }
    
    private void addSiteRulesFlow(final int n, final RuleFlow ruleFlow) {
        ruleFlow.getClass();
        this.ensureSiteRulesFlowIsMutable();
        ((List<RuleFlow>)this.siteRulesFlow_).add(n, ruleFlow);
    }
    
    private void addSiteRulesFlow(final RuleFlow ruleFlow) {
        ruleFlow.getClass();
        this.ensureSiteRulesFlowIsMutable();
        ((List<RuleFlow>)this.siteRulesFlow_).add(ruleFlow);
    }
    
    private void clearRules() {
        this.rules_ = (Internal$j<SubredditRule>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearSiteRules() {
        this.siteRules_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearSiteRulesFlow() {
        this.siteRulesFlow_ = (Internal$j<RuleFlow>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureRulesIsMutable() {
        final Internal$j<SubredditRule> rules_ = this.rules_;
        if (!rules_.E0()) {
            this.rules_ = (Internal$j<SubredditRule>)GeneratedMessageLite.mutableCopy((Internal$j)rules_);
        }
    }
    
    private void ensureSiteRulesFlowIsMutable() {
        final Internal$j<RuleFlow> siteRulesFlow_ = this.siteRulesFlow_;
        if (!siteRulesFlow_.E0()) {
            this.siteRulesFlow_ = (Internal$j<RuleFlow>)GeneratedMessageLite.mutableCopy((Internal$j)siteRulesFlow_);
        }
    }
    
    private void ensureSiteRulesIsMutable() {
        final Internal$j<StringValue> siteRules_ = this.siteRules_;
        if (!siteRules_.E0()) {
            this.siteRules_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)siteRules_);
        }
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse getDefaultInstance() {
        return SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditAboutRulesResponse subredditsMsg$SubredditAboutRulesResponse) {
        return (a)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditAboutRulesResponse);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditAboutRulesResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutRulesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditAboutRulesResponse> parser() {
        return (n1<SubredditsMsg$SubredditAboutRulesResponse>)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeRules(final int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }
    
    private void removeSiteRules(final int n) {
        this.ensureSiteRulesIsMutable();
        this.siteRules_.remove(n);
    }
    
    private void removeSiteRulesFlow(final int n) {
        this.ensureSiteRulesFlowIsMutable();
        this.siteRulesFlow_.remove(n);
    }
    
    private void setRules(final int n, final SubredditRule subredditRule) {
        subredditRule.getClass();
        this.ensureRulesIsMutable();
        ((List<SubredditRule>)this.rules_).set(n, subredditRule);
    }
    
    private void setSiteRules(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureSiteRulesIsMutable();
        ((List<StringValue>)this.siteRules_).set(n, stringValue);
    }
    
    private void setSiteRulesFlow(final int n, final RuleFlow ruleFlow) {
        ruleFlow.getClass();
        this.ensureSiteRulesFlowIsMutable();
        ((List<RuleFlow>)this.siteRulesFlow_).set(n, ruleFlow);
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
                final n1<SubredditsMsg$SubredditAboutRulesResponse> parser;
                if ((parser = SubredditsMsg$SubredditAboutRulesResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditAboutRulesResponse.class) {
                        if (SubredditsMsg$SubredditAboutRulesResponse.PARSER == null) {
                            SubredditsMsg$SubredditAboutRulesResponse.PARSER = (n1<SubredditsMsg$SubredditAboutRulesResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditAboutRulesResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[] { "rules_", SubredditRule.class, "siteRules_", StringValue.class, "siteRulesFlow_", RuleFlow.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditAboutRulesResponse();
            }
        }
    }
    
    public SubredditRule getRules(final int n) {
        return ((List<SubredditRule>)this.rules_).get(n);
    }
    
    public int getRulesCount() {
        return ((List)this.rules_).size();
    }
    
    public List<SubredditRule> getRulesList() {
        return (List<SubredditRule>)this.rules_;
    }
    
    public SubredditsMsg$SubredditAboutRulesResponse$c getRulesOrBuilder(final int n) {
        return ((List<SubredditsMsg$SubredditAboutRulesResponse$c>)this.rules_).get(n);
    }
    
    public List<? extends SubredditsMsg$SubredditAboutRulesResponse$c> getRulesOrBuilderList() {
        return (List<? extends SubredditsMsg$SubredditAboutRulesResponse$c>)this.rules_;
    }
    
    public StringValue getSiteRules(final int n) {
        return ((List<StringValue>)this.siteRules_).get(n);
    }
    
    public int getSiteRulesCount() {
        return ((List)this.siteRules_).size();
    }
    
    public RuleFlow getSiteRulesFlow(final int n) {
        return ((List<RuleFlow>)this.siteRulesFlow_).get(n);
    }
    
    public int getSiteRulesFlowCount() {
        return ((List)this.siteRulesFlow_).size();
    }
    
    public List<RuleFlow> getSiteRulesFlowList() {
        return (List<RuleFlow>)this.siteRulesFlow_;
    }
    
    public SubredditsMsg$SubredditAboutRulesResponse$b getSiteRulesFlowOrBuilder(final int n) {
        return ((List<SubredditsMsg$SubredditAboutRulesResponse$b>)this.siteRulesFlow_).get(n);
    }
    
    public List<? extends SubredditsMsg$SubredditAboutRulesResponse$b> getSiteRulesFlowOrBuilderList() {
        return (List<? extends SubredditsMsg$SubredditAboutRulesResponse$b>)this.siteRulesFlow_;
    }
    
    public List<StringValue> getSiteRulesList() {
        return (List<StringValue>)this.siteRules_;
    }
    
    public x1 getSiteRulesOrBuilder(final int n) {
        return ((List<x1>)this.siteRules_).get(n);
    }
    
    public List<? extends x1> getSiteRulesOrBuilderList() {
        return (List<? extends x1>)this.siteRules_;
    }
    
    public static final class RuleFlow extends GeneratedMessageLite<RuleFlow, a> implements SubredditsMsg$SubredditAboutRulesResponse$b
    {
        public static final int CAN_SPECIFY_USERNAMES_FIELD_NUMBER = 14;
        public static final int CAN_WRITE_NOTES_FIELD_NUMBER = 10;
        public static final int COMPLAINT_BUTTON_TEXT_FIELD_NUMBER = 5;
        public static final int COMPLAINT_PAGE_TITLE_FIELD_NUMBER = 7;
        public static final int COMPLAINT_PROMPT_FIELD_NUMBER = 9;
        public static final int COMPLAINT_URL_FIELD_NUMBER = 6;
        private static final RuleFlow DEFAULT_INSTANCE;
        public static final int FILE_COMPLAINT_FIELD_NUMBER = 8;
        public static final int IS_ABUSE_OF_REPORT_BUTTON_FIELD_NUMBER = 11;
        public static final int NEXT_STEP_HEADER_FIELD_NUMBER = 3;
        public static final int NEXT_STEP_REASONS_FIELD_NUMBER = 4;
        public static final int NOTES_INPUT_TITLE_FIELD_NUMBER = 12;
        public static final int ONE_USERNAME_FIELD_NUMBER = 16;
        private static volatile n1<RuleFlow> PARSER;
        public static final int REASON_TEXT_FIELD_NUMBER = 2;
        public static final int REASON_TEXT_TO_SHOW_FIELD_NUMBER = 1;
        public static final int REQUEST_CRISIS_SUPPORT_FIELD_NUMBER = 15;
        public static final int USERNAMES_INPUT_TITLE_FIELD_NUMBER = 13;
        private BoolValue canSpecifyUsernames_;
        private BoolValue canWriteNotes_;
        private StringValue complaintButtonText_;
        private StringValue complaintPageTitle_;
        private StringValue complaintPrompt_;
        private StringValue complaintUrl_;
        private BoolValue fileComplaint_;
        private BoolValue isAbuseOfReportButton_;
        private StringValue nextStepHeader_;
        private Internal$j<RuleFlow> nextStepReasons_;
        private StringValue notesInputTitle_;
        private BoolValue oneUsername_;
        private StringValue reasonTextToShow_;
        private StringValue reasonText_;
        private BoolValue requestCrisisSupport_;
        private StringValue usernamesInputTitle_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)RuleFlow.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new RuleFlow()));
        }
        
        private RuleFlow() {
            this.nextStepReasons_ = (Internal$j<RuleFlow>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static RuleFlow access$134100() {
            return RuleFlow.DEFAULT_INSTANCE;
        }
        
        public static void access$134200(final RuleFlow ruleFlow, final StringValue reasonTextToShow) {
            ruleFlow.setReasonTextToShow(reasonTextToShow);
        }
        
        public static void access$134300(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeReasonTextToShow(stringValue);
        }
        
        public static void access$134400(final RuleFlow ruleFlow) {
            ruleFlow.clearReasonTextToShow();
        }
        
        public static void access$134500(final RuleFlow ruleFlow, final StringValue reasonText) {
            ruleFlow.setReasonText(reasonText);
        }
        
        public static void access$134600(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeReasonText(stringValue);
        }
        
        public static void access$134700(final RuleFlow ruleFlow) {
            ruleFlow.clearReasonText();
        }
        
        public static void access$134800(final RuleFlow ruleFlow, final StringValue nextStepHeader) {
            ruleFlow.setNextStepHeader(nextStepHeader);
        }
        
        public static void access$134900(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeNextStepHeader(stringValue);
        }
        
        public static void access$135000(final RuleFlow ruleFlow) {
            ruleFlow.clearNextStepHeader();
        }
        
        public static void access$135100(final RuleFlow ruleFlow, final int n, final RuleFlow ruleFlow2) {
            ruleFlow.setNextStepReasons(n, ruleFlow2);
        }
        
        public static void access$135200(final RuleFlow ruleFlow, final RuleFlow ruleFlow2) {
            ruleFlow.addNextStepReasons(ruleFlow2);
        }
        
        public static void access$135300(final RuleFlow ruleFlow, final int n, final RuleFlow ruleFlow2) {
            ruleFlow.addNextStepReasons(n, ruleFlow2);
        }
        
        public static void access$135400(final RuleFlow ruleFlow, final Iterable iterable) {
            ruleFlow.addAllNextStepReasons(iterable);
        }
        
        public static void access$135500(final RuleFlow ruleFlow) {
            ruleFlow.clearNextStepReasons();
        }
        
        public static void access$135600(final RuleFlow ruleFlow, final int n) {
            ruleFlow.removeNextStepReasons(n);
        }
        
        public static void access$135700(final RuleFlow ruleFlow, final StringValue complaintButtonText) {
            ruleFlow.setComplaintButtonText(complaintButtonText);
        }
        
        public static void access$135800(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeComplaintButtonText(stringValue);
        }
        
        public static void access$135900(final RuleFlow ruleFlow) {
            ruleFlow.clearComplaintButtonText();
        }
        
        public static void access$136000(final RuleFlow ruleFlow, final StringValue complaintUrl) {
            ruleFlow.setComplaintUrl(complaintUrl);
        }
        
        public static void access$136100(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeComplaintUrl(stringValue);
        }
        
        public static void access$136200(final RuleFlow ruleFlow) {
            ruleFlow.clearComplaintUrl();
        }
        
        public static void access$136300(final RuleFlow ruleFlow, final StringValue complaintPageTitle) {
            ruleFlow.setComplaintPageTitle(complaintPageTitle);
        }
        
        public static void access$136400(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeComplaintPageTitle(stringValue);
        }
        
        public static void access$136500(final RuleFlow ruleFlow) {
            ruleFlow.clearComplaintPageTitle();
        }
        
        public static void access$136600(final RuleFlow ruleFlow, final BoolValue fileComplaint) {
            ruleFlow.setFileComplaint(fileComplaint);
        }
        
        public static void access$136700(final RuleFlow ruleFlow, final BoolValue boolValue) {
            ruleFlow.mergeFileComplaint(boolValue);
        }
        
        public static void access$136800(final RuleFlow ruleFlow) {
            ruleFlow.clearFileComplaint();
        }
        
        public static void access$136900(final RuleFlow ruleFlow, final StringValue complaintPrompt) {
            ruleFlow.setComplaintPrompt(complaintPrompt);
        }
        
        public static void access$137000(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeComplaintPrompt(stringValue);
        }
        
        public static void access$137100(final RuleFlow ruleFlow) {
            ruleFlow.clearComplaintPrompt();
        }
        
        public static void access$137200(final RuleFlow ruleFlow, final BoolValue canWriteNotes) {
            ruleFlow.setCanWriteNotes(canWriteNotes);
        }
        
        public static void access$137300(final RuleFlow ruleFlow, final BoolValue boolValue) {
            ruleFlow.mergeCanWriteNotes(boolValue);
        }
        
        public static void access$137400(final RuleFlow ruleFlow) {
            ruleFlow.clearCanWriteNotes();
        }
        
        public static void access$137500(final RuleFlow ruleFlow, final BoolValue isAbuseOfReportButton) {
            ruleFlow.setIsAbuseOfReportButton(isAbuseOfReportButton);
        }
        
        public static void access$137600(final RuleFlow ruleFlow, final BoolValue boolValue) {
            ruleFlow.mergeIsAbuseOfReportButton(boolValue);
        }
        
        public static void access$137700(final RuleFlow ruleFlow) {
            ruleFlow.clearIsAbuseOfReportButton();
        }
        
        public static void access$137800(final RuleFlow ruleFlow, final StringValue notesInputTitle) {
            ruleFlow.setNotesInputTitle(notesInputTitle);
        }
        
        public static void access$137900(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeNotesInputTitle(stringValue);
        }
        
        public static void access$138000(final RuleFlow ruleFlow) {
            ruleFlow.clearNotesInputTitle();
        }
        
        public static void access$138100(final RuleFlow ruleFlow, final StringValue usernamesInputTitle) {
            ruleFlow.setUsernamesInputTitle(usernamesInputTitle);
        }
        
        public static void access$138200(final RuleFlow ruleFlow, final StringValue stringValue) {
            ruleFlow.mergeUsernamesInputTitle(stringValue);
        }
        
        public static void access$138300(final RuleFlow ruleFlow) {
            ruleFlow.clearUsernamesInputTitle();
        }
        
        public static void access$138400(final RuleFlow ruleFlow, final BoolValue canSpecifyUsernames) {
            ruleFlow.setCanSpecifyUsernames(canSpecifyUsernames);
        }
        
        public static void access$138500(final RuleFlow ruleFlow, final BoolValue boolValue) {
            ruleFlow.mergeCanSpecifyUsernames(boolValue);
        }
        
        public static void access$138600(final RuleFlow ruleFlow) {
            ruleFlow.clearCanSpecifyUsernames();
        }
        
        public static void access$138700(final RuleFlow ruleFlow, final BoolValue requestCrisisSupport) {
            ruleFlow.setRequestCrisisSupport(requestCrisisSupport);
        }
        
        public static void access$138800(final RuleFlow ruleFlow, final BoolValue boolValue) {
            ruleFlow.mergeRequestCrisisSupport(boolValue);
        }
        
        public static void access$138900(final RuleFlow ruleFlow) {
            ruleFlow.clearRequestCrisisSupport();
        }
        
        public static void access$139000(final RuleFlow ruleFlow, final BoolValue oneUsername) {
            ruleFlow.setOneUsername(oneUsername);
        }
        
        public static void access$139100(final RuleFlow ruleFlow, final BoolValue boolValue) {
            ruleFlow.mergeOneUsername(boolValue);
        }
        
        public static void access$139200(final RuleFlow ruleFlow) {
            ruleFlow.clearOneUsername();
        }
        
        private void addAllNextStepReasons(final Iterable<? extends RuleFlow> iterable) {
            this.ensureNextStepReasonsIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.nextStepReasons_);
        }
        
        private void addNextStepReasons(final int n, final RuleFlow ruleFlow) {
            ruleFlow.getClass();
            this.ensureNextStepReasonsIsMutable();
            ((List<RuleFlow>)this.nextStepReasons_).add(n, ruleFlow);
        }
        
        private void addNextStepReasons(final RuleFlow ruleFlow) {
            ruleFlow.getClass();
            this.ensureNextStepReasonsIsMutable();
            ((List<RuleFlow>)this.nextStepReasons_).add(ruleFlow);
        }
        
        private void clearCanSpecifyUsernames() {
            this.canSpecifyUsernames_ = null;
        }
        
        private void clearCanWriteNotes() {
            this.canWriteNotes_ = null;
        }
        
        private void clearComplaintButtonText() {
            this.complaintButtonText_ = null;
        }
        
        private void clearComplaintPageTitle() {
            this.complaintPageTitle_ = null;
        }
        
        private void clearComplaintPrompt() {
            this.complaintPrompt_ = null;
        }
        
        private void clearComplaintUrl() {
            this.complaintUrl_ = null;
        }
        
        private void clearFileComplaint() {
            this.fileComplaint_ = null;
        }
        
        private void clearIsAbuseOfReportButton() {
            this.isAbuseOfReportButton_ = null;
        }
        
        private void clearNextStepHeader() {
            this.nextStepHeader_ = null;
        }
        
        private void clearNextStepReasons() {
            this.nextStepReasons_ = (Internal$j<RuleFlow>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearNotesInputTitle() {
            this.notesInputTitle_ = null;
        }
        
        private void clearOneUsername() {
            this.oneUsername_ = null;
        }
        
        private void clearReasonText() {
            this.reasonText_ = null;
        }
        
        private void clearReasonTextToShow() {
            this.reasonTextToShow_ = null;
        }
        
        private void clearRequestCrisisSupport() {
            this.requestCrisisSupport_ = null;
        }
        
        private void clearUsernamesInputTitle() {
            this.usernamesInputTitle_ = null;
        }
        
        private void ensureNextStepReasonsIsMutable() {
            final Internal$j<RuleFlow> nextStepReasons_ = this.nextStepReasons_;
            if (!nextStepReasons_.E0()) {
                this.nextStepReasons_ = (Internal$j<RuleFlow>)GeneratedMessageLite.mutableCopy((Internal$j)nextStepReasons_);
            }
        }
        
        public static RuleFlow getDefaultInstance() {
            return RuleFlow.DEFAULT_INSTANCE;
        }
        
        private void mergeCanSpecifyUsernames(final BoolValue canSpecifyUsernames_) {
            canSpecifyUsernames_.getClass();
            final BoolValue canSpecifyUsernames_2 = this.canSpecifyUsernames_;
            if (canSpecifyUsernames_2 != null && canSpecifyUsernames_2 != BoolValue.getDefaultInstance()) {
                this.canSpecifyUsernames_ = (BoolValue)o.g(this.canSpecifyUsernames_, canSpecifyUsernames_);
            }
            else {
                this.canSpecifyUsernames_ = canSpecifyUsernames_;
            }
        }
        
        private void mergeCanWriteNotes(final BoolValue canWriteNotes_) {
            canWriteNotes_.getClass();
            final BoolValue canWriteNotes_2 = this.canWriteNotes_;
            if (canWriteNotes_2 != null && canWriteNotes_2 != BoolValue.getDefaultInstance()) {
                this.canWriteNotes_ = (BoolValue)o.g(this.canWriteNotes_, canWriteNotes_);
            }
            else {
                this.canWriteNotes_ = canWriteNotes_;
            }
        }
        
        private void mergeComplaintButtonText(final StringValue complaintButtonText_) {
            complaintButtonText_.getClass();
            final StringValue complaintButtonText_2 = this.complaintButtonText_;
            if (complaintButtonText_2 != null && complaintButtonText_2 != StringValue.getDefaultInstance()) {
                this.complaintButtonText_ = (StringValue)w.e(this.complaintButtonText_, complaintButtonText_);
            }
            else {
                this.complaintButtonText_ = complaintButtonText_;
            }
        }
        
        private void mergeComplaintPageTitle(final StringValue complaintPageTitle_) {
            complaintPageTitle_.getClass();
            final StringValue complaintPageTitle_2 = this.complaintPageTitle_;
            if (complaintPageTitle_2 != null && complaintPageTitle_2 != StringValue.getDefaultInstance()) {
                this.complaintPageTitle_ = (StringValue)w.e(this.complaintPageTitle_, complaintPageTitle_);
            }
            else {
                this.complaintPageTitle_ = complaintPageTitle_;
            }
        }
        
        private void mergeComplaintPrompt(final StringValue complaintPrompt_) {
            complaintPrompt_.getClass();
            final StringValue complaintPrompt_2 = this.complaintPrompt_;
            if (complaintPrompt_2 != null && complaintPrompt_2 != StringValue.getDefaultInstance()) {
                this.complaintPrompt_ = (StringValue)w.e(this.complaintPrompt_, complaintPrompt_);
            }
            else {
                this.complaintPrompt_ = complaintPrompt_;
            }
        }
        
        private void mergeComplaintUrl(final StringValue complaintUrl_) {
            complaintUrl_.getClass();
            final StringValue complaintUrl_2 = this.complaintUrl_;
            if (complaintUrl_2 != null && complaintUrl_2 != StringValue.getDefaultInstance()) {
                this.complaintUrl_ = (StringValue)w.e(this.complaintUrl_, complaintUrl_);
            }
            else {
                this.complaintUrl_ = complaintUrl_;
            }
        }
        
        private void mergeFileComplaint(final BoolValue fileComplaint_) {
            fileComplaint_.getClass();
            final BoolValue fileComplaint_2 = this.fileComplaint_;
            if (fileComplaint_2 != null && fileComplaint_2 != BoolValue.getDefaultInstance()) {
                this.fileComplaint_ = (BoolValue)o.g(this.fileComplaint_, fileComplaint_);
            }
            else {
                this.fileComplaint_ = fileComplaint_;
            }
        }
        
        private void mergeIsAbuseOfReportButton(final BoolValue isAbuseOfReportButton_) {
            isAbuseOfReportButton_.getClass();
            final BoolValue isAbuseOfReportButton_2 = this.isAbuseOfReportButton_;
            if (isAbuseOfReportButton_2 != null && isAbuseOfReportButton_2 != BoolValue.getDefaultInstance()) {
                this.isAbuseOfReportButton_ = (BoolValue)o.g(this.isAbuseOfReportButton_, isAbuseOfReportButton_);
            }
            else {
                this.isAbuseOfReportButton_ = isAbuseOfReportButton_;
            }
        }
        
        private void mergeNextStepHeader(final StringValue nextStepHeader_) {
            nextStepHeader_.getClass();
            final StringValue nextStepHeader_2 = this.nextStepHeader_;
            if (nextStepHeader_2 != null && nextStepHeader_2 != StringValue.getDefaultInstance()) {
                this.nextStepHeader_ = (StringValue)w.e(this.nextStepHeader_, nextStepHeader_);
            }
            else {
                this.nextStepHeader_ = nextStepHeader_;
            }
        }
        
        private void mergeNotesInputTitle(final StringValue notesInputTitle_) {
            notesInputTitle_.getClass();
            final StringValue notesInputTitle_2 = this.notesInputTitle_;
            if (notesInputTitle_2 != null && notesInputTitle_2 != StringValue.getDefaultInstance()) {
                this.notesInputTitle_ = (StringValue)w.e(this.notesInputTitle_, notesInputTitle_);
            }
            else {
                this.notesInputTitle_ = notesInputTitle_;
            }
        }
        
        private void mergeOneUsername(final BoolValue oneUsername_) {
            oneUsername_.getClass();
            final BoolValue oneUsername_2 = this.oneUsername_;
            if (oneUsername_2 != null && oneUsername_2 != BoolValue.getDefaultInstance()) {
                this.oneUsername_ = (BoolValue)o.g(this.oneUsername_, oneUsername_);
            }
            else {
                this.oneUsername_ = oneUsername_;
            }
        }
        
        private void mergeReasonText(final StringValue reasonText_) {
            reasonText_.getClass();
            final StringValue reasonText_2 = this.reasonText_;
            if (reasonText_2 != null && reasonText_2 != StringValue.getDefaultInstance()) {
                this.reasonText_ = (StringValue)w.e(this.reasonText_, reasonText_);
            }
            else {
                this.reasonText_ = reasonText_;
            }
        }
        
        private void mergeReasonTextToShow(final StringValue reasonTextToShow_) {
            reasonTextToShow_.getClass();
            final StringValue reasonTextToShow_2 = this.reasonTextToShow_;
            if (reasonTextToShow_2 != null && reasonTextToShow_2 != StringValue.getDefaultInstance()) {
                this.reasonTextToShow_ = (StringValue)w.e(this.reasonTextToShow_, reasonTextToShow_);
            }
            else {
                this.reasonTextToShow_ = reasonTextToShow_;
            }
        }
        
        private void mergeRequestCrisisSupport(final BoolValue requestCrisisSupport_) {
            requestCrisisSupport_.getClass();
            final BoolValue requestCrisisSupport_2 = this.requestCrisisSupport_;
            if (requestCrisisSupport_2 != null && requestCrisisSupport_2 != BoolValue.getDefaultInstance()) {
                this.requestCrisisSupport_ = (BoolValue)o.g(this.requestCrisisSupport_, requestCrisisSupport_);
            }
            else {
                this.requestCrisisSupport_ = requestCrisisSupport_;
            }
        }
        
        private void mergeUsernamesInputTitle(final StringValue usernamesInputTitle_) {
            usernamesInputTitle_.getClass();
            final StringValue usernamesInputTitle_2 = this.usernamesInputTitle_;
            if (usernamesInputTitle_2 != null && usernamesInputTitle_2 != StringValue.getDefaultInstance()) {
                this.usernamesInputTitle_ = (StringValue)w.e(this.usernamesInputTitle_, usernamesInputTitle_);
            }
            else {
                this.usernamesInputTitle_ = usernamesInputTitle_;
            }
        }
        
        public static a newBuilder() {
            return (a)RuleFlow.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final RuleFlow ruleFlow) {
            return (a)RuleFlow.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)ruleFlow);
        }
        
        public static RuleFlow parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (RuleFlow)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, inputStream);
        }
        
        public static RuleFlow parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (RuleFlow)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static RuleFlow parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, byteString);
        }
        
        public static RuleFlow parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static RuleFlow parseFrom(final l l) throws IOException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, l);
        }
        
        public static RuleFlow parseFrom(final l l, final d0 d0) throws IOException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, l, d0);
        }
        
        public static RuleFlow parseFrom(final InputStream inputStream) throws IOException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, inputStream);
        }
        
        public static RuleFlow parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static RuleFlow parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static RuleFlow parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static RuleFlow parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, array);
        }
        
        public static RuleFlow parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (RuleFlow)GeneratedMessageLite.parseFrom((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<RuleFlow> parser() {
            return (n1<RuleFlow>)RuleFlow.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeNextStepReasons(final int n) {
            this.ensureNextStepReasonsIsMutable();
            this.nextStepReasons_.remove(n);
        }
        
        private void setCanSpecifyUsernames(final BoolValue canSpecifyUsernames_) {
            canSpecifyUsernames_.getClass();
            this.canSpecifyUsernames_ = canSpecifyUsernames_;
        }
        
        private void setCanWriteNotes(final BoolValue canWriteNotes_) {
            canWriteNotes_.getClass();
            this.canWriteNotes_ = canWriteNotes_;
        }
        
        private void setComplaintButtonText(final StringValue complaintButtonText_) {
            complaintButtonText_.getClass();
            this.complaintButtonText_ = complaintButtonText_;
        }
        
        private void setComplaintPageTitle(final StringValue complaintPageTitle_) {
            complaintPageTitle_.getClass();
            this.complaintPageTitle_ = complaintPageTitle_;
        }
        
        private void setComplaintPrompt(final StringValue complaintPrompt_) {
            complaintPrompt_.getClass();
            this.complaintPrompt_ = complaintPrompt_;
        }
        
        private void setComplaintUrl(final StringValue complaintUrl_) {
            complaintUrl_.getClass();
            this.complaintUrl_ = complaintUrl_;
        }
        
        private void setFileComplaint(final BoolValue fileComplaint_) {
            fileComplaint_.getClass();
            this.fileComplaint_ = fileComplaint_;
        }
        
        private void setIsAbuseOfReportButton(final BoolValue isAbuseOfReportButton_) {
            isAbuseOfReportButton_.getClass();
            this.isAbuseOfReportButton_ = isAbuseOfReportButton_;
        }
        
        private void setNextStepHeader(final StringValue nextStepHeader_) {
            nextStepHeader_.getClass();
            this.nextStepHeader_ = nextStepHeader_;
        }
        
        private void setNextStepReasons(final int n, final RuleFlow ruleFlow) {
            ruleFlow.getClass();
            this.ensureNextStepReasonsIsMutable();
            ((List<RuleFlow>)this.nextStepReasons_).set(n, ruleFlow);
        }
        
        private void setNotesInputTitle(final StringValue notesInputTitle_) {
            notesInputTitle_.getClass();
            this.notesInputTitle_ = notesInputTitle_;
        }
        
        private void setOneUsername(final BoolValue oneUsername_) {
            oneUsername_.getClass();
            this.oneUsername_ = oneUsername_;
        }
        
        private void setReasonText(final StringValue reasonText_) {
            reasonText_.getClass();
            this.reasonText_ = reasonText_;
        }
        
        private void setReasonTextToShow(final StringValue reasonTextToShow_) {
            reasonTextToShow_.getClass();
            this.reasonTextToShow_ = reasonTextToShow_;
        }
        
        private void setRequestCrisisSupport(final BoolValue requestCrisisSupport_) {
            requestCrisisSupport_.getClass();
            this.requestCrisisSupport_ = requestCrisisSupport_;
        }
        
        private void setUsernamesInputTitle(final StringValue usernamesInputTitle_) {
            usernamesInputTitle_.getClass();
            this.usernamesInputTitle_ = usernamesInputTitle_;
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
                    final n1<RuleFlow> parser;
                    if ((parser = RuleFlow.PARSER) == null) {
                        synchronized (RuleFlow.class) {
                            if (RuleFlow.PARSER == null) {
                                RuleFlow.PARSER = (n1<RuleFlow>)new GeneratedMessageLite$c((GeneratedMessageLite)RuleFlow.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return RuleFlow.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)RuleFlow.DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\u001b\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t", new Object[] { "reasonTextToShow_", "reasonText_", "nextStepHeader_", "nextStepReasons_", RuleFlow.class, "complaintButtonText_", "complaintUrl_", "complaintPageTitle_", "fileComplaint_", "complaintPrompt_", "canWriteNotes_", "isAbuseOfReportButton_", "notesInputTitle_", "usernamesInputTitle_", "canSpecifyUsernames_", "requestCrisisSupport_", "oneUsername_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new RuleFlow();
                }
            }
        }
        
        public BoolValue getCanSpecifyUsernames() {
            BoolValue boolValue;
            if ((boolValue = this.canSpecifyUsernames_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getCanWriteNotes() {
            BoolValue boolValue;
            if ((boolValue = this.canWriteNotes_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getComplaintButtonText() {
            StringValue stringValue;
            if ((stringValue = this.complaintButtonText_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getComplaintPageTitle() {
            StringValue stringValue;
            if ((stringValue = this.complaintPageTitle_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getComplaintPrompt() {
            StringValue stringValue;
            if ((stringValue = this.complaintPrompt_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getComplaintUrl() {
            StringValue stringValue;
            if ((stringValue = this.complaintUrl_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getFileComplaint() {
            BoolValue boolValue;
            if ((boolValue = this.fileComplaint_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsAbuseOfReportButton() {
            BoolValue boolValue;
            if ((boolValue = this.isAbuseOfReportButton_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getNextStepHeader() {
            StringValue stringValue;
            if ((stringValue = this.nextStepHeader_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public RuleFlow getNextStepReasons(final int n) {
            return ((List<RuleFlow>)this.nextStepReasons_).get(n);
        }
        
        public int getNextStepReasonsCount() {
            return ((List)this.nextStepReasons_).size();
        }
        
        public List<RuleFlow> getNextStepReasonsList() {
            return (List<RuleFlow>)this.nextStepReasons_;
        }
        
        public SubredditsMsg$SubredditAboutRulesResponse$b getNextStepReasonsOrBuilder(final int n) {
            return ((List<SubredditsMsg$SubredditAboutRulesResponse$b>)this.nextStepReasons_).get(n);
        }
        
        public List<? extends SubredditsMsg$SubredditAboutRulesResponse$b> getNextStepReasonsOrBuilderList() {
            return (List<? extends SubredditsMsg$SubredditAboutRulesResponse$b>)this.nextStepReasons_;
        }
        
        public StringValue getNotesInputTitle() {
            StringValue stringValue;
            if ((stringValue = this.notesInputTitle_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getOneUsername() {
            BoolValue boolValue;
            if ((boolValue = this.oneUsername_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getReasonText() {
            StringValue stringValue;
            if ((stringValue = this.reasonText_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getReasonTextToShow() {
            StringValue stringValue;
            if ((stringValue = this.reasonTextToShow_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getRequestCrisisSupport() {
            BoolValue boolValue;
            if ((boolValue = this.requestCrisisSupport_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getUsernamesInputTitle() {
            StringValue stringValue;
            if ((stringValue = this.usernamesInputTitle_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasCanSpecifyUsernames() {
            return this.canSpecifyUsernames_ != null;
        }
        
        public boolean hasCanWriteNotes() {
            return this.canWriteNotes_ != null;
        }
        
        public boolean hasComplaintButtonText() {
            return this.complaintButtonText_ != null;
        }
        
        public boolean hasComplaintPageTitle() {
            return this.complaintPageTitle_ != null;
        }
        
        public boolean hasComplaintPrompt() {
            return this.complaintPrompt_ != null;
        }
        
        public boolean hasComplaintUrl() {
            return this.complaintUrl_ != null;
        }
        
        public boolean hasFileComplaint() {
            return this.fileComplaint_ != null;
        }
        
        public boolean hasIsAbuseOfReportButton() {
            return this.isAbuseOfReportButton_ != null;
        }
        
        public boolean hasNextStepHeader() {
            return this.nextStepHeader_ != null;
        }
        
        public boolean hasNotesInputTitle() {
            return this.notesInputTitle_ != null;
        }
        
        public boolean hasOneUsername() {
            return this.oneUsername_ != null;
        }
        
        public boolean hasReasonText() {
            return this.reasonText_ != null;
        }
        
        public boolean hasReasonTextToShow() {
            return this.reasonTextToShow_ != null;
        }
        
        public boolean hasRequestCrisisSupport() {
            return this.requestCrisisSupport_ != null;
        }
        
        public boolean hasUsernamesInputTitle() {
            return this.usernamesInputTitle_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<RuleFlow, a> implements SubredditsMsg$SubredditAboutRulesResponse$b
        {
            public a() {
                super((GeneratedMessageLite)RuleFlow.access$134100());
            }
        }
    }
    
    public static final class SubredditRule extends GeneratedMessageLite<SubredditRule, a> implements SubredditsMsg$SubredditAboutRulesResponse$c
    {
        public static final int CREATED_UTC_FIELD_NUMBER = 5;
        private static final SubredditRule DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int DESCRIPTION_HTML_FIELD_NUMBER = 7;
        public static final int KIND_FIELD_NUMBER = 1;
        private static volatile n1<SubredditRule> PARSER;
        public static final int PRIORITY_FIELD_NUMBER = 6;
        public static final int SHORT_NAME_FIELD_NUMBER = 3;
        public static final int VIOLATION_REASON_FIELD_NUMBER = 4;
        private Int64Value createdUtc_;
        private StringValue descriptionHtml_;
        private StringValue description_;
        private StringValue kind_;
        private Int32Value priority_;
        private StringValue shortName_;
        private StringValue violationReason_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)SubredditRule.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditRule()));
        }
        
        private SubredditRule() {
        }
        
        public static SubredditRule access$131800() {
            return SubredditRule.DEFAULT_INSTANCE;
        }
        
        public static void access$131900(final SubredditRule subredditRule, final StringValue kind) {
            subredditRule.setKind(kind);
        }
        
        public static void access$132000(final SubredditRule subredditRule, final StringValue stringValue) {
            subredditRule.mergeKind(stringValue);
        }
        
        public static void access$132100(final SubredditRule subredditRule) {
            subredditRule.clearKind();
        }
        
        public static void access$132200(final SubredditRule subredditRule, final StringValue description) {
            subredditRule.setDescription(description);
        }
        
        public static void access$132300(final SubredditRule subredditRule, final StringValue stringValue) {
            subredditRule.mergeDescription(stringValue);
        }
        
        public static void access$132400(final SubredditRule subredditRule) {
            subredditRule.clearDescription();
        }
        
        public static void access$132500(final SubredditRule subredditRule, final StringValue shortName) {
            subredditRule.setShortName(shortName);
        }
        
        public static void access$132600(final SubredditRule subredditRule, final StringValue stringValue) {
            subredditRule.mergeShortName(stringValue);
        }
        
        public static void access$132700(final SubredditRule subredditRule) {
            subredditRule.clearShortName();
        }
        
        public static void access$132800(final SubredditRule subredditRule, final StringValue violationReason) {
            subredditRule.setViolationReason(violationReason);
        }
        
        public static void access$132900(final SubredditRule subredditRule, final StringValue stringValue) {
            subredditRule.mergeViolationReason(stringValue);
        }
        
        public static void access$133000(final SubredditRule subredditRule) {
            subredditRule.clearViolationReason();
        }
        
        public static void access$133100(final SubredditRule subredditRule, final Int64Value createdUtc) {
            subredditRule.setCreatedUtc(createdUtc);
        }
        
        public static void access$133200(final SubredditRule subredditRule, final Int64Value int64Value) {
            subredditRule.mergeCreatedUtc(int64Value);
        }
        
        public static void access$133300(final SubredditRule subredditRule) {
            subredditRule.clearCreatedUtc();
        }
        
        public static void access$133400(final SubredditRule subredditRule, final Int32Value priority) {
            subredditRule.setPriority(priority);
        }
        
        public static void access$133500(final SubredditRule subredditRule, final Int32Value int32Value) {
            subredditRule.mergePriority(int32Value);
        }
        
        public static void access$133600(final SubredditRule subredditRule) {
            subredditRule.clearPriority();
        }
        
        public static void access$133700(final SubredditRule subredditRule, final StringValue descriptionHtml) {
            subredditRule.setDescriptionHtml(descriptionHtml);
        }
        
        public static void access$133800(final SubredditRule subredditRule, final StringValue stringValue) {
            subredditRule.mergeDescriptionHtml(stringValue);
        }
        
        public static void access$133900(final SubredditRule subredditRule) {
            subredditRule.clearDescriptionHtml();
        }
        
        private void clearCreatedUtc() {
            this.createdUtc_ = null;
        }
        
        private void clearDescription() {
            this.description_ = null;
        }
        
        private void clearDescriptionHtml() {
            this.descriptionHtml_ = null;
        }
        
        private void clearKind() {
            this.kind_ = null;
        }
        
        private void clearPriority() {
            this.priority_ = null;
        }
        
        private void clearShortName() {
            this.shortName_ = null;
        }
        
        private void clearViolationReason() {
            this.violationReason_ = null;
        }
        
        public static SubredditRule getDefaultInstance() {
            return SubredditRule.DEFAULT_INSTANCE;
        }
        
        private void mergeCreatedUtc(final Int64Value createdUtc_) {
            createdUtc_.getClass();
            final Int64Value createdUtc_2 = this.createdUtc_;
            if (createdUtc_2 != null && createdUtc_2 != Int64Value.getDefaultInstance()) {
                this.createdUtc_ = (Int64Value)h.b(this.createdUtc_, createdUtc_);
            }
            else {
                this.createdUtc_ = createdUtc_;
            }
        }
        
        private void mergeDescription(final StringValue description_) {
            description_.getClass();
            final StringValue description_2 = this.description_;
            if (description_2 != null && description_2 != StringValue.getDefaultInstance()) {
                this.description_ = (StringValue)w.e(this.description_, description_);
            }
            else {
                this.description_ = description_;
            }
        }
        
        private void mergeDescriptionHtml(final StringValue descriptionHtml_) {
            descriptionHtml_.getClass();
            final StringValue descriptionHtml_2 = this.descriptionHtml_;
            if (descriptionHtml_2 != null && descriptionHtml_2 != StringValue.getDefaultInstance()) {
                this.descriptionHtml_ = (StringValue)w.e(this.descriptionHtml_, descriptionHtml_);
            }
            else {
                this.descriptionHtml_ = descriptionHtml_;
            }
        }
        
        private void mergeKind(final StringValue kind_) {
            kind_.getClass();
            final StringValue kind_2 = this.kind_;
            if (kind_2 != null && kind_2 != StringValue.getDefaultInstance()) {
                this.kind_ = (StringValue)w.e(this.kind_, kind_);
            }
            else {
                this.kind_ = kind_;
            }
        }
        
        private void mergePriority(final Int32Value priority_) {
            priority_.getClass();
            final Int32Value priority_2 = this.priority_;
            if (priority_2 != null && priority_2 != Int32Value.getDefaultInstance()) {
                this.priority_ = (Int32Value)b.d(this.priority_, priority_);
            }
            else {
                this.priority_ = priority_;
            }
        }
        
        private void mergeShortName(final StringValue shortName_) {
            shortName_.getClass();
            final StringValue shortName_2 = this.shortName_;
            if (shortName_2 != null && shortName_2 != StringValue.getDefaultInstance()) {
                this.shortName_ = (StringValue)w.e(this.shortName_, shortName_);
            }
            else {
                this.shortName_ = shortName_;
            }
        }
        
        private void mergeViolationReason(final StringValue violationReason_) {
            violationReason_.getClass();
            final StringValue violationReason_2 = this.violationReason_;
            if (violationReason_2 != null && violationReason_2 != StringValue.getDefaultInstance()) {
                this.violationReason_ = (StringValue)w.e(this.violationReason_, violationReason_);
            }
            else {
                this.violationReason_ = violationReason_;
            }
        }
        
        public static a newBuilder() {
            return (a)SubredditRule.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final SubredditRule subredditRule) {
            return (a)SubredditRule.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditRule);
        }
        
        public static SubredditRule parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (SubredditRule)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, inputStream);
        }
        
        public static SubredditRule parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (SubredditRule)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static SubredditRule parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, byteString);
        }
        
        public static SubredditRule parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static SubredditRule parseFrom(final l l) throws IOException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, l);
        }
        
        public static SubredditRule parseFrom(final l l, final d0 d0) throws IOException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, l, d0);
        }
        
        public static SubredditRule parseFrom(final InputStream inputStream) throws IOException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, inputStream);
        }
        
        public static SubredditRule parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static SubredditRule parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static SubredditRule parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static SubredditRule parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, array);
        }
        
        public static SubredditRule parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (SubredditRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<SubredditRule> parser() {
            return (n1<SubredditRule>)SubredditRule.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setCreatedUtc(final Int64Value createdUtc_) {
            createdUtc_.getClass();
            this.createdUtc_ = createdUtc_;
        }
        
        private void setDescription(final StringValue description_) {
            description_.getClass();
            this.description_ = description_;
        }
        
        private void setDescriptionHtml(final StringValue descriptionHtml_) {
            descriptionHtml_.getClass();
            this.descriptionHtml_ = descriptionHtml_;
        }
        
        private void setKind(final StringValue kind_) {
            kind_.getClass();
            this.kind_ = kind_;
        }
        
        private void setPriority(final Int32Value priority_) {
            priority_.getClass();
            this.priority_ = priority_;
        }
        
        private void setShortName(final StringValue shortName_) {
            shortName_.getClass();
            this.shortName_ = shortName_;
        }
        
        private void setViolationReason(final StringValue violationReason_) {
            violationReason_.getClass();
            this.violationReason_ = violationReason_;
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
                    final n1<SubredditRule> parser;
                    if ((parser = SubredditRule.PARSER) == null) {
                        synchronized (SubredditRule.class) {
                            if (SubredditRule.PARSER == null) {
                                SubredditRule.PARSER = (n1<SubredditRule>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditRule.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return SubredditRule.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)SubredditRule.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[] { "kind_", "description_", "shortName_", "violationReason_", "createdUtc_", "priority_", "descriptionHtml_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new SubredditRule();
                }
            }
        }
        
        public Int64Value getCreatedUtc() {
            Int64Value int64Value;
            if ((int64Value = this.createdUtc_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getDescription() {
            StringValue stringValue;
            if ((stringValue = this.description_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getDescriptionHtml() {
            StringValue stringValue;
            if ((stringValue = this.descriptionHtml_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getKind() {
            StringValue stringValue;
            if ((stringValue = this.kind_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int32Value getPriority() {
            Int32Value int32Value;
            if ((int32Value = this.priority_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public StringValue getShortName() {
            StringValue stringValue;
            if ((stringValue = this.shortName_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getViolationReason() {
            StringValue stringValue;
            if ((stringValue = this.violationReason_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasCreatedUtc() {
            return this.createdUtc_ != null;
        }
        
        public boolean hasDescription() {
            return this.description_ != null;
        }
        
        public boolean hasDescriptionHtml() {
            return this.descriptionHtml_ != null;
        }
        
        public boolean hasKind() {
            return this.kind_ != null;
        }
        
        public boolean hasPriority() {
            return this.priority_ != null;
        }
        
        public boolean hasShortName() {
            return this.shortName_ != null;
        }
        
        public boolean hasViolationReason() {
            return this.violationReason_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<SubredditRule, a> implements SubredditsMsg$SubredditAboutRulesResponse$c
        {
            public a() {
                super((GeneratedMessageLite)SubredditRule.access$131800());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditAboutRulesResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditAboutRulesResponse.access$139400());
        }
    }
}
