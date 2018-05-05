package io.github.esha.sprngcboa.repository;

import io.github.esha.sprngcboa.domain.Authority;

/**
 * Spring Data Couchbase repository for the Authority entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}
