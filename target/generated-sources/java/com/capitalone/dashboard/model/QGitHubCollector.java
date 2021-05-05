package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGitHubCollector is a Querydsl query type for GitHubCollector
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGitHubCollector extends EntityPathBase<GitHubCollector> {

    private static final long serialVersionUID = -999951384L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGitHubCollector gitHubCollector = new QGitHubCollector("gitHubCollector");

    public final QCollector _super;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> allFields;

    //inherited
    public final StringPath clientReference;

    //inherited
    public final EnumPath<CollectorType> collectorType;

    //inherited
    public final BooleanPath enabled;

    //inherited
    public final ListPath<CollectionError, QCollectionError> errors;

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> lastCleanUpTimestamp = createNumber("lastCleanUpTimestamp", Long.class);

    //inherited
    public final NumberPath<Long> lastExecuted;

    //inherited
    public final NumberPath<Long> lastExecutedSeconds;

    //inherited
    public final DateTimePath<java.util.Date> lastExecutedTime;

    //inherited
    public final NumberPath<Long> lastExecutionRecordCount;

    public final NumberPath<Long> lastPrivateRepoCollectionTimestamp = createNumber("lastPrivateRepoCollectionTimestamp", Long.class);

    public final NumberPath<Long> latestProcessedEventId = createNumber("latestProcessedEventId", Long.class);

    public final NumberPath<Long> latestProcessedEventTimestamp = createNumber("latestProcessedEventTimestamp", Long.class);

    //inherited
    public final StringPath name;

    //inherited
    public final BooleanPath online;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> properties;

    //inherited
    public final ListPath<String, StringPath> searchFields;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> uniqueFields;

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QGitHubCollector(String variable) {
        this(GitHubCollector.class, forVariable(variable), INITS);
    }

    public QGitHubCollector(Path<? extends GitHubCollector> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGitHubCollector(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGitHubCollector(PathMetadata metadata, PathInits inits) {
        this(GitHubCollector.class, metadata, inits);
    }

    public QGitHubCollector(Class<? extends GitHubCollector> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QCollector(type, metadata, inits);
        this.allFields = _super.allFields;
        this.clientReference = _super.clientReference;
        this.collectorType = _super.collectorType;
        this.enabled = _super.enabled;
        this.errors = _super.errors;
        this.id = _super.id;
        this.lastExecuted = _super.lastExecuted;
        this.lastExecutedSeconds = _super.lastExecutedSeconds;
        this.lastExecutedTime = _super.lastExecutedTime;
        this.lastExecutionRecordCount = _super.lastExecutionRecordCount;
        this.name = _super.name;
        this.online = _super.online;
        this.properties = _super.properties;
        this.searchFields = _super.searchFields;
        this.uniqueFields = _super.uniqueFields;
        this.upsertTime = _super.upsertTime;
    }

}

