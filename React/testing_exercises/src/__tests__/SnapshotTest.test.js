import React from 'react';
import { shallow } from 'enzyme';
import { ContentTest } from '../ContentTest';

it('snapshot test', () => {
  const wrapper = shallow(<ContentTest />);
  
  expect(wrapper).toMatchSnapshot()
  
  wrapper.find('[name="addOne"]').simulate("click");

  expect(wrapper).toMatchSnapshot();

});
