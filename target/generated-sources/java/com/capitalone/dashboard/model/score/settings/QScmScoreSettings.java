package com.capitalone.dashboard.model.score.settings;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScmScoreSettings is a Querydsl query type for ScmScoreSettings
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QScmScoreSettings extends BeanPath<ScmScoreSettings> {

    private static final long serialVersionUID = 1629304293L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScmScoreSettings scmScoreSettings = new QScmScoreSettings("scmScoreSettings");

    public final QScoreComponentSettings _super = new QScoreComponentSettings(this);

    //inherited
    public final SimplePath<ScoreCriteria> criteria = _super.criteria;

    public final QScoreComponentSettings daysWithCommits;

    //inherited
    public final BooleanPath disabled = _super.disabled;

    public final NumberPath<Integer> numberOfDays = createNumber("numberOfDays", Integer.class);

    //inherited
    public final NumberPath<Integer> weight = _super.weight;

    public QScmScoreSettings(String variable) {
        this(ScmScoreSettings.class, forVariable(variable), INITS);
    }

    public QScmScoreSettings(Path<? extends ScmScoreSettings> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScmScoreSettings(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScmScoreSettings(PathMetadata metadata, PathInits inits) {
        this(ScmScoreSettings.class, metadata, inits);
    }

    public QScmScoreSettings(Class<? extends ScmScoreSettings> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.daysWithCommits = inits.isInitialized("daysWithCommits") ? new QScoreComponentSettings(forProperty("daysWithCommits")) : null;
    }

}

