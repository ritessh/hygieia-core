package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLibraryPolicyResult is a Querydsl query type for LibraryPolicyResult
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLibraryPolicyResult extends EntityPathBase<LibraryPolicyResult> {

    private static final long serialVersionUID = 828663080L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLibraryPolicyResult libraryPolicyResult = new QLibraryPolicyResult("libraryPolicyResult");

    public final QBaseModel _super;

    public final org.bson.types.QObjectId buildId;

    public final StringPath buildUrl = createString("buildUrl");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final NumberPath<Long> evaluationTimestamp = createNumber("evaluationTimestamp", Long.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Integer> knownComponentCount = createNumber("knownComponentCount", Integer.class);

    public final ListPath<PolicyScanMetric, QPolicyScanMetric> policyAlert = this.<PolicyScanMetric, QPolicyScanMetric>createList("policyAlert", PolicyScanMetric.class, QPolicyScanMetric.class, PathInits.DIRECT2);

    public final StringPath productName = createString("productName");

    public final StringPath projectName = createString("projectName");

    public final StringPath reportUrl = createString("reportUrl");

    public final StringPath scanState = createString("scanState");

    public final MapPath<LibraryPolicyType, java.util.Set<LibraryPolicyResult.Threat>, SimplePath<java.util.Set<LibraryPolicyResult.Threat>>> threats = this.<LibraryPolicyType, java.util.Set<LibraryPolicyResult.Threat>, SimplePath<java.util.Set<LibraryPolicyResult.Threat>>>createMap("threats", LibraryPolicyType.class, java.util.Set.class, SimplePath.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final NumberPath<Integer> totalComponentCount = createNumber("totalComponentCount", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QLibraryPolicyResult(String variable) {
        this(LibraryPolicyResult.class, forVariable(variable), INITS);
    }

    public QLibraryPolicyResult(Path<? extends LibraryPolicyResult> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLibraryPolicyResult(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLibraryPolicyResult(PathMetadata metadata, PathInits inits) {
        this(LibraryPolicyResult.class, metadata, inits);
    }

    public QLibraryPolicyResult(Class<? extends LibraryPolicyResult> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.buildId = inits.isInitialized("buildId") ? new org.bson.types.QObjectId(forProperty("buildId")) : null;
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

