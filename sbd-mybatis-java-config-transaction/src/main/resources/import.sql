--
--    Copyright 2015-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

DROP TABLE IF EXISTS city;
DROP TABLE IF EXISTS hotel;

CREATE TABLE city (
  id      INT PRIMARY KEY AUTO_INCREMENT,
  name    VARCHAR(50),
  state   VARCHAR(50),
  country VARCHAR(50)
);
CREATE TABLE hotel (
  city    INT,
  name    VARCHAR(50),
  address VARCHAR(50),
  zip     VARCHAR(50)
);

INSERT INTO city (name, state, country) VALUES ('San Francisco', 'CA', 'US');
INSERT INTO hotel (city, name, address, zip) VALUES (1, 'Conrad Treasury Place', 'William & George Streets', '4001')
