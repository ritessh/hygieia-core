package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTestResult is a Querydsl query type for TestResult
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTestResult extends EntityPathBase<TestResult> {

    private static final long serialVersionUID = -1383944015L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTestResult testResult = new QTestResult("testResult");

    public final QBaseModel _super;

    public final SimplePath<Object> buildArtifact = createSimple("buildArtifact", Object.class);

    public final org.bson.types.QObjectId buildId;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath description = createString("description");

    public final NumberPath<Long> duration = createNumber("duration", Long.class);

    public final NumberPath<Long> endTime = createNumber("endTime", Long.class);

    public final StringPath executionId = createString("executionId");

    public final NumberPath<Integer> failureCount = createNumber("failureCount", Integer.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath perfRisk = createString("perfRisk");

    public final StringPath resultStatus = createString("resultStatus");

    public final NumberPath<Integer> skippedCount = createNumber("skippedCount", Integer.class);

    public final NumberPath<Long> startTime = createNumber("startTime", Long.class);

    public final NumberPath<Integer> successCount = createNumber("successCount", Integer.class);

    public final StringPath targetAppName = createString("targetAppName");

    public final StringPath targetEnvName = createString("targetEnvName");

    public final CollectionPath<TestCapability, QTestCapability> testCapabilities = this.<TestCapability, QTestCapability>createCollection("testCapabilities", TestCapability.class, QTestCapability.class, PathInits.DIRECT2);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final NumberPath<Integer> totalCount = createNumber("totalCount", Integer.class);

    public final EnumPath<TestSuiteType> type = createEnum("type", TestSuiteType.class);

    public final NumberPath<Integer> unknownStatusCount = createNumber("unknownStatusCount", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath url = createString("url");

    public QTestResult(String variable) {
        this(TestResult.class, forVariable(variable), INITS);
    }

    public QTestResult(Path<? extends TestResult> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTestResult(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTestResult(PathMetadata metadata, PathInits inits) {
        this(TestResult.class, metadata, inits);
    }

    public QTestResult(Class<? extends TestResult> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.buildId = inits.isInitialized("buildId") ? new org.bson.types.QObjectId(forProperty("buildId")) : null;
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

