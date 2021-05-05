package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInfrastructureScan is a Querydsl query type for InfrastructureScan
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInfrastructureScan extends EntityPathBase<InfrastructureScan> {

    private static final long serialVersionUID = 745480738L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInfrastructureScan infrastructureScan = new QInfrastructureScan("infrastructureScan");

    public final QBaseModel _super;

    public final StringPath applicationOwnerFullName = createString("applicationOwnerFullName");

    public final org.bson.types.QObjectId buildId;

    public final StringPath buildUrl = createString("buildUrl");

    public final StringPath businessApplication = createString("businessApplication");

    public final StringPath businessService = createString("businessService");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath createdTimeStamp = createString("createdTimeStamp");

    public final StringPath developmentOwner = createString("developmentOwner");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath instanceId = createString("instanceId");

    public final StringPath ipAddress = createString("ipAddress");

    public final ListPath<Labels, QLabels> labels = this.<Labels, QLabels>createList("labels", Labels.class, QLabels.class, PathInits.DIRECT2);

    public final NumberPath<Integer> limit = createNumber("limit", Integer.class);

    public final StringPath nextRecordKey = createString("nextRecordKey");

    public final StringPath ownerDept = createString("ownerDept");

    public final StringPath ownerEmailAddress = createString("ownerEmailAddress");

    public final StringPath ownerSubDept = createString("ownerSubDept");

    public final QRepositoryDigest repositoryDigest;

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final ListPath<Vulnerability, QVulnerability> vulnerabilities = this.<Vulnerability, QVulnerability>createList("vulnerabilities", Vulnerability.class, QVulnerability.class, PathInits.DIRECT2);

    public QInfrastructureScan(String variable) {
        this(InfrastructureScan.class, forVariable(variable), INITS);
    }

    public QInfrastructureScan(Path<? extends InfrastructureScan> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInfrastructureScan(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInfrastructureScan(PathMetadata metadata, PathInits inits) {
        this(InfrastructureScan.class, metadata, inits);
    }

    public QInfrastructureScan(Class<? extends InfrastructureScan> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.buildId = inits.isInitialized("buildId") ? new org.bson.types.QObjectId(forProperty("buildId")) : null;
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.repositoryDigest = inits.isInitialized("repositoryDigest") ? new QRepositoryDigest(forProperty("repositoryDigest")) : null;
        this.upsertTime = _super.upsertTime;
    }

}

