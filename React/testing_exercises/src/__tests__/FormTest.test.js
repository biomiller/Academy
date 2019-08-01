import React from "react";
import { mount } from "enzyme";
import FormTest from "../FormTest";

it("submit a form", () => {

  const wrapper = mount(<FormTest />);

  wrapper.find('[name="first"]').instance().value = "Mark";
  wrapper.find('[name="last"]').instance().value = "Wright";
  wrapper.find("form").simulate("submit");

  expect(wrapper.contains(<p name="suppliedFirst">Mark</p>)).toBeTruthy();
  expect(wrapper.contains(<p name="suppliedLast">Wright</p>)).toBeTruthy();
});
