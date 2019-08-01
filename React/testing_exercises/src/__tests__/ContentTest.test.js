import React from 'react';
import { shallow } from 'enzyme';
import { ContentTest } from '../ContentTest';

it('content test', () => {
  const wrapper = shallow(<ContentTest />);
  expect(wrapper.contains(<h2>Look at me i'm content!</h2>))
});
