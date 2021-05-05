package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTeamLevelDetails is a Querydsl query type for TeamLevelDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTeamLevelDetails extends EntityPathBase<TeamLevelDetails> {

    private static final long serialVersionUID = -1427472131L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTeamLevelDetails teamLevelDetails = new QTeamLevelDetails("teamLevelDetails");

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

    //inherited
    public final BooleanPath pushed;

    //inherited
    public final StringPath refreshLink;

    public final StringPath teamId = createString("teamId");

    public final StringPath teamName = createString("teamName");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath url = createString("url");

    public QTeamLevelDetails(String variable) {
        this(TeamLevelDetails.class, forVariable(variable), INITS);
    }

    public QTeamLevelDetails(Path<? extends TeamLevelDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTeamLevelDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTeamLevelDetails(PathMetadata metadata, PathInits inits) {
        this(TeamLevelDetails.class, metadata, inits);
    }

    public QTeamLevelDetails(Class<? extends TeamLevelDetails> type, PathMetadata metadata, PathInits inits) {
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

