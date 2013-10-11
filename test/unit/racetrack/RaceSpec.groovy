package racetrack

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Race)
class RaceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test inMiles"() {
      when:
      def race = new Race(distance:5.0)

      then:
      race.inMiles() == 3.107
    }
}
