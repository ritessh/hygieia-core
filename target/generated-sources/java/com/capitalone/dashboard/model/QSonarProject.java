package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSonarProject is a Querydsl query type for SonarProject
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSonarProject extends EntityPathBase<SonarProject> {

    private static final long serialVersionUID = -41193160L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSonarProject sonarProject = new QSonarProject("sonarProject");

    public final QCollectorItem _super;

    //inherited
    public final StringPath clientReference;

    // inherited
    public final QCollector collector;

    // inherited
    public final org.bson.types.QObjectId collectorId;

    //inherited
    public final StringPath description;

    //inherited
    public final BooleanPath enabled;

    //inherited
    public final StringPath environment;

    //inherited
    public final NumberPath<Integer> errorCount;

    //inherited
    public final ListPath<CollectionError, QCollectionError> errors;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath instanceUrl = createString("instanceUrl");

    //inherited
    public final NumberPath<Long> lastUpdated;

    //inherited
    public final StringPath niceName;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> options;

    public final StringPath projectId = createString("projectId");

    public final StringPath projectName = createString("projectName");

    //inherited
    public final BooleanPath pushed;

    //inherited
    public final StringPath refreshLink;

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QSonarProject(String variable) {
        this(SonarProject.class, forVariable(variable), INITS);
    }

    public QSonarProject(Path<? extends SonarProject> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSonarProject(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSonarProject(PathMetadata metadata, PathInits inits) {
        this(SonarProject.class, metadata, inits);
    }

    public QSonarProject(Class<? extends SonarProject> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QCollectorItem(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collector = _super.collector;
        this.collectorId = _super.collectorId;
        this.description = _super.description;
        this.enabled = _super.enabled;
        this.environment = _super.environment;
        this.errorCount = _super.errorCount;
        this.errors = _super.errors;
        this.id = _super.id;
        this.lastUpdated = _super.lastUpdated;
        this.niceName = _super.niceName;
        this.options = _super.options;
        this.pushed = _super.pushed;
        this.refreshLink = _super.refreshLink;
        this.upsertTime = _super.upsertTime;
    }

}

